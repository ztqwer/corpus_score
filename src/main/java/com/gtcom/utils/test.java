package com.gtcom.utils;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
public class test {
    public static void main(String[] args) throws Exception{

        String xmlStr = "<p>　sss　 　　　　　<p><SECONDTITLE>化学的历史发展</SECONDTITLE>0000</p></p>";
        Document document = DocumentHelper.parseText(xmlStr);
//        System.out.println(xmlStr);
        parseElement(document.getRootElement());

    }
    private static void parseElement(Element e) {
        String name = e.getName();//标签名
        System.out.println();
        for (Iterator iter = e.elementIterator(); iter.hasNext();) {
            Element element = (Element) iter.next();
            System.out.println(e.getXPathResult(0).getText());
            parseElement(element);//递归调用
        }
    }

}
