package com.gtcom.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/19.
 */
public class LanguagePair implements Serializable{
    //主见id
    private int id;
    //语言对英文名称
    private String languagePairEn;
    //语言对中文名称
    private String languagePairZh;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguagePairEn() {
        return languagePairEn;
    }

    public void setLanguagePairEn(String languagePairEn) {
        this.languagePairEn = languagePairEn;
    }

    public String getLanguagePairZh() {
        return languagePairZh;
    }

    public void setLanguagePairZh(String languagePairZh) {
        this.languagePairZh = languagePairZh;
    }
}
