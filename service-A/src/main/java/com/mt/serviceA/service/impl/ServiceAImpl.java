package com.mt.serviceA.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import com.mt.serviceA.mapper.UserMapper;
import com.my.api.mapper.entity.User;
import com.my.api.service.ServiceA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * author: liqm
 * 2020-04-21
 */
@Slf4j
@Service(
        version = "1.0.0",
        application = "ServiceA",
        protocol = "dubbo",
        registry = "my-registry"
)
public class ServiceAImpl implements ServiceA {

    @Autowired
    private UserMapper userMapper;

    @Override
    @TxTransaction(propagation = DTXPropagation.SUPPORTS)
    @Transactional
    public void save() {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName("服务A添加");
        userMapper.save(user);
    }
}
