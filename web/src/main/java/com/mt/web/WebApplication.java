package com.mt.web;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * author: liqm
 * 2020-04-21
 */
@SpringBootApplication
@EnableDistributedTransaction
@MapperScan(basePackages = {"com.mt.**.mapper"})
//@EnableEurekaClient
//@EnableDiscoveryClient
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
//
//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
