package com.titina.shixun.controller;

import com.titina.shixun.bean.UserBean;
import com.titina.shixun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    //将Service层注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String author){
        UserBean userBean = userService.loginIn(name,author);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }
}
