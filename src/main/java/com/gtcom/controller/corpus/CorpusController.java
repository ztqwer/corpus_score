package com.gtcom.controller.corpus;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.gtcom.bean.corpus.Corpus;
import com.gtcom.bean.corpus.CorpusBasic;
import com.gtcom.service.corpus.CorpusBasicService;
import com.gtcom.service.corpus.CorpusService;
import com.sargeraswang.util.ExcelUtil.ExcelLogs;
import com.sargeraswang.util.ExcelUtil.ExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Administrator on 2017/12/19.
 */

@RequestMapping("corpus")
@Controller
public  class CorpusController {

    @Resource
    private CorpusBasicService corpusBasicService;

    @Resource
    private CorpusService corpusService;


    @RequestMapping("")
    public String importHtml(){
        return "corpus/import";
    }

    @RequestMapping("corpusList")
    public String index(){

        return "corpus/corpusList";
    }

    @RequestMapping("getCorpusList")
    @ResponseBody
    public String  getCorpusList(){
        List<Map<String,String>> list = corpusBasicService.getList();
       Gson gson = new Gson();

        return gson.toJson(list).toString();
    }


    @RequestMapping(value="import",method= RequestMethod.POST)
    @ResponseBody
    public JSONArray upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("*******************************");
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Iterator<String> fileNames = multipartRequest.getFileNames();
        MultipartFile multipartFile = multipartRequest.getFile(fileNames.next());
        String fileAlias = multipartFile.getName();
        //获得文件原始名称
        String name = multipartFile.getOriginalFilename();
        InputStream inputStream = multipartFile.getInputStream();
        //解析Excel
        ExcelLogs logs =new ExcelLogs();
        Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);
        //插入语料基本表
        Date date = new Date();
        CorpusBasic corpusBasic = new CorpusBasic();
        corpusBasic.setCorpusName(name);
        corpusBasic.setCreateId("123");
        corpusBasic.setLanguagePairId(1);
        corpusBasic.setCreateTime(date);
        String id  = corpusBasicService.add(corpusBasic);
        //插入语料表
        List<Corpus> list = new ArrayList<>();
        for(Map map : importExcel){
            Corpus corpus = new Corpus();
            corpus.setCorpusId(id);
            corpus.setSourceText(map.get("中文").toString());
            corpus.setTargetTextOne(map.get("英文1").toString());
            corpus.setTargetTextTwo(map.get("英文2").toString());
            corpus.setTargetTextThree(map.get("英文3").toString());
            corpus.setTargetTextFour(map.get("英文4").toString());
            list.add(corpus);
        }
        corpusService.insertBatch(list);

        JSONArray ja = new JSONArray();
        //调用翻译方法
        System.out.println("返回成功！！！");
        return ja;
    }

}
