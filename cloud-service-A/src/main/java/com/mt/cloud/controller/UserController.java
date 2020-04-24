package com.mt.cloud.controller;

import com.mt.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: liqm
 * 2020-04-21
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/addUser")
    @ResponseBody
    public String addUser(){

        userService.save();

        return "OK";
    }
}
