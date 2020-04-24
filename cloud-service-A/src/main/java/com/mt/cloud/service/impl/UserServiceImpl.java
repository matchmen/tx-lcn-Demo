package com.mt.cloud.service.impl;

import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.mt.cloud.repository.UserRepository;
import com.mt.cloud.repository.entity.User;
import com.mt.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * author: liqm
 * 2020-04-21
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    @LcnTransaction
    public void save() {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName("Cloud服务A添加");
        userRepository.save(user);
    }
}
