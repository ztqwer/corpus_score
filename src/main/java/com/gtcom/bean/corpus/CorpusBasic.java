package com.gtcom.bean.corpus;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/12/19.
 */
public class CorpusBasic {
    //主键id
    private String id;
    //语料名称
    private String corpusName;
    //语料语言对
    private int languagePairId;
    //原始语料数量
    private int sourceCorpusNum;
    //目标语料数量
    private int targetCorpusNum;
    //创建时间
    private Date createTime;
    //创建人
    private String createId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorpusName() {
        return corpusName;
    }

    public void setCorpusName(String corpusName) {
        this.corpusName = corpusName;
    }

    public int getLanguagePairId() {
        return languagePairId;
    }

    public void setLanguagePairId(int languagePairId) {
        this.languagePairId = languagePairId;
    }

    public int getSourceCorpusNum() {
        return sourceCorpusNum;
    }

    public void setSourceCorpusNum(int sourceCorpusNum) {
        this.sourceCorpusNum = sourceCorpusNum;
    }

    public int getTargetCorpusNum() {
        return targetCorpusNum;
    }

    public void setTargetCorpusNum(int targetCorpusNum) {
        this.targetCorpusNum = targetCorpusNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }
}
