package com.example.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 * @Auther: GEEX1428
 * @Date: 2021/4/9 17:52
 * @Description:
 */
@Controller
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping(value = {"/index","/","/login"})
    public String index(ModelMap mmap){
        logger.info(String.format("*****系统登陆，请求时间：%s", LocalDateTime.now()));
        return "index";
    }
}
