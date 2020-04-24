package com.mt.web.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.mt.web.mapper.UserMapper;
import com.mt.web.service.UserSrvice;
import com.my.api.mapper.entity.User;
import com.my.api.service.ServiceA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * author: liqm
 * 2020-04-21
 */
@Slf4j
@Service
public class UserServiceImpl implements UserSrvice {

    @Autowired
    private UserMapper userMapper;
    //@Reference(retries = -1)
    @Reference(version = "1.0.0",
            application = "ServiceA",
            registry = "127.0.0.1:2181",
            retries = -1,
            check = false,
            loadbalance = "txlcn_random")
    private ServiceA serviceA;

//    @Autowired
//    private RestTemplate restTemplate;


    @Override
    @LcnTransaction
    @Transactional
    public void saveUser(String isRollback) {

        log.info("调ServiceA服务->开始远程事务。。。。");
        serviceA.save();

        isRollback.equals("2");
        log.info("开始本地事务。。。。");
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName("本地事务保存");
        userMapper.save(user);

        isRollback.equals("2");
    }

    @Override
    //@LcnTransaction
    public void saveUserCloud(String isRollback) {

//        log.info("调Cloud ServiceA服务开始远程事务。。。。");
//
//        restTemplate.getForObject("http://CLOUD-SERVER-A/addUser",String.class);
//        log.info("开始本地远程事务。。。。");
//        User user = new User();
//        user.setId(System.currentTimeMillis());
//        user.setName("本地事务保存");
//        userRepository.save(user);
//
//        if(Objects.isNull(isRollback)){
//            throw new IllegalArgumentException("回滚事务");
//        }
    }



}
