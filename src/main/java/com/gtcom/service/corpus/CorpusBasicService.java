package com.gtcom.service.corpus;

import com.gtcom.bean.corpus.CorpusBasic;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/20.
 */
public interface CorpusBasicService {

    public String add(CorpusBasic bean);

    public List<Map<String,String>> getList();
}
