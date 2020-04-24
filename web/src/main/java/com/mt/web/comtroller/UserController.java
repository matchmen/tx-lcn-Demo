package com.mt.web.comtroller;

import com.mt.web.service.UserSrvice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: liqm
 * 2020-04-21
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserSrvice userSrvice;

    @PostMapping(value = "/saveUserCloud")
    public String saveUserCloud() {
        userSrvice.saveUserCloud(null);
        return "OK";
    }

    @PostMapping(value = "/saveUserCloud1")
    public String saveUserCloud1() {
        userSrvice.saveUserCloud("a");
        return "OK";
    }

    @PostMapping(value = "/saveUser")
    public String saveUser(@RequestParam(value = "isRollback",required = false) String isRollback) {
        log.info("isRollback:{}",isRollback);
        userSrvice.saveUser(isRollback);
        return "OK";
    }



}
