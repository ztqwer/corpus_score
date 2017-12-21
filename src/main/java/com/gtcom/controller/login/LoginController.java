package com.gtcom.controller.login;

import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/11/30.
 */
@Controller
@RequestMapping("/login")
public class LoginController {


    @RequestMapping("")
    public String index(){

        return "login";
    }


    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(value="username",required=false) String username,
                        @RequestParam(value="password",required=false) String password){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("123","123");
        subject.login(token);
        JSONObject json = new JSONObject();
        json.put("flag","success");
        return json.toString();
//        return "login";
    }


    @RequestMapping("/success")
    public String success(){
        return "success";
    }

}
