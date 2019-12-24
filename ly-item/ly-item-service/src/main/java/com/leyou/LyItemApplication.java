package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: LyItemApplication
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/18 23:19
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class);
    }
}
