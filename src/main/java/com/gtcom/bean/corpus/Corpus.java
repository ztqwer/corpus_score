package com.gtcom.bean.corpus;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/19.
 */
public class Corpus implements Serializable {
    private String id;

    private String corpusId;

    private String sourceText;

    private String targetTextOne;

    private String targetTextTwo;

    private String targetTextThree;

    private String targetTextFour;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorpusId() {
        return corpusId;
    }

    public void setCorpusId(String corpusId) {
        this.corpusId = corpusId;
    }

    public String getSourceText() {
        return sourceText;
    }

    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
    }

    public String getTargetTextOne() {
        return targetTextOne;
    }

    public void setTargetTextOne(String targetTextOne) {
        this.targetTextOne = targetTextOne;
    }

    public String getTargetTextTwo() {
        return targetTextTwo;
    }

    public void setTargetTextTwo(String targetTextTwo) {
        this.targetTextTwo = targetTextTwo;
    }

    public String getTargetTextThree() {
        return targetTextThree;
    }

    public void setTargetTextThree(String targetTextThree) {
        this.targetTextThree = targetTextThree;
    }

    public String getTargetTextFour() {
        return targetTextFour;
    }

    public void setTargetTextFour(String targetTextFour) {
        this.targetTextFour = targetTextFour;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
