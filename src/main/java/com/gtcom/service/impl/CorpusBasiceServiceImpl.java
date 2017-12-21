package com.gtcom.service.impl;

import com.gtcom.bean.corpus.CorpusBasic;
import com.gtcom.mapper.CorpusBasicMapper;
import com.gtcom.mapper.CorpusMapper;
import com.gtcom.service.CorpusBasicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/12/20.
 */
@Service
@Transactional
public class CorpusBasiceServiceImpl implements CorpusBasicService{

    @Resource
    private CorpusBasicMapper corpusBasicMapper;

    @Override
    @Transactional
    public String add(CorpusBasic bean) {
        corpusBasicMapper.add(bean);
        System.out.println(bean.getId());
        return bean.getId();
    }
}
