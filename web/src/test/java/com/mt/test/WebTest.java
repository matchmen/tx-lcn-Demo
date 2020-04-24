package com.mt.test;

import com.mt.web.WebApplication;
import com.mt.web.service.UserSrvice;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * author: liqm
 * 2020-04-21
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WebApplication.class)
@Slf4j
public class WebTest {

    @Autowired
    private UserSrvice userSrvice;

    @Test
    public void saveUser() {

        String isRollback = null;
        //isRollback = "haha";

        userSrvice.saveUser(isRollback);

    }
    @Test
    public void saveUserCloud() {

        String isRollback = null;
         isRollback = "haha";

        userSrvice.saveUserCloud(isRollback);

    }


}
