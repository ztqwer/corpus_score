package com.gtcom.mapper;

import com.gtcom.bean.corpus.Corpus;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/19.
 */
@Repository
public interface CorpusMapper {

    void insertBatch(@Param("list") List<Corpus> list);

}
