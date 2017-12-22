package com.gtcom.service.corpus.impl;

import com.gtcom.bean.corpus.CorpusBasic;
import com.gtcom.mapper.CorpusBasicMapper;
import com.gtcom.service.corpus.CorpusBasicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/20.
 */
@Service
@Transactional
public class CorpusBasiceServiceImpl implements CorpusBasicService {

    @Resource
    private CorpusBasicMapper corpusBasicMapper;

    @Override
    public String add(CorpusBasic bean) {
        corpusBasicMapper.add(bean);
        System.out.println(bean.getId());
        return bean.getId();
    }

    @Override
    public List<Map<String,String>> getList() {
         List<Map<String,String>> list = corpusBasicMapper.getCorpusBasicList();
         return list;

    }
}
