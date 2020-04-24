package com.mt.cloud;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * author: liqm
 * 2020-04-21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
public class CloudServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServiceAApplication.class, args);
    }

}
