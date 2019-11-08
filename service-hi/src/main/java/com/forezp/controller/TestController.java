package com.forezp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by changxianchuang on 2019/11/8.
 */
@RestController
@RequestMapping("/service/")
public class TestController {
    @Value("server.port")
    public String port;

    @RequestMapping("hi")
    public String home(HttpServletRequest request){
        String name = request.getParameter("name");
        name = name==null?" service ":name;
        return "hi " + name + " ,i am from port " + port;
    }

}
