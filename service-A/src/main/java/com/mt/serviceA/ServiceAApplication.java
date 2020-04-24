package com.mt.serviceA;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author: liqm
 * 2020-04-21
 */
@SpringBootApplication
@EnableDistributedTransaction
//@EnableTransactionManagement
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
