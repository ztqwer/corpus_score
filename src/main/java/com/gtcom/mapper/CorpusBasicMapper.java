package com.gtcom.mapper;

import com.gtcom.bean.corpus.CorpusBasic;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/19.
 */
@Repository
public interface CorpusBasicMapper {

    void add(CorpusBasic bean);

    List<Map<String,String>> getCorpusBasicList();

}
