package com.gtcom.service;

import com.gtcom.bean.corpus.Corpus;

import java.util.List;

/**
 * Created by Administrator on 2017/12/20.
 */
public interface CorpusService {

    public void insertBatch(List<Corpus> list);
}
