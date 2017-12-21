package com.gtcom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/1.
 */
@Controller
@RequestMapping("index")
public class IndexController {

    public String index(){
        return "test/index";
    }

}
