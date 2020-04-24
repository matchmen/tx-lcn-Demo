//package com.mt.serviceA.service.impl;
//
//import com.codingapi.txlcn.tc.annotation.*;
//import com.mt.serviceA.repository.entity.User;
//import com.mt.serviceA.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * author: liqm
// * 2020-04-21
// */
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    @TxTransaction
//    @Transactional
//    public void save() {
//        User user = new User();
//        user.setId(System.currentTimeMillis());
//        user.setName("服务A添加");
//        userRepository.save(user);
//    }
//}
