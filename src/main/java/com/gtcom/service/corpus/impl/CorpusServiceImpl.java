package com.gtcom.service.corpus.impl;

import com.gtcom.bean.corpus.Corpus;
import com.gtcom.mapper.CorpusMapper;
import com.gtcom.service.corpus.CorpusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/20.
 */
@Service
public class CorpusServiceImpl implements CorpusService {

    @Resource
    private CorpusMapper corpusMapper;

    @Override
    public void insertBatch(List<Corpus> list) {
        corpusMapper.insertBatch(list);
    }
}
