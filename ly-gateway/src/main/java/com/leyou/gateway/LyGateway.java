package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: LyGateway
 * @Description: TODO
 * @Author: Baseen
 * @Date: 2019/12/18 22:32
 **/
@EnableZuulProxy
@SpringBootApplication
public class LyGateway {
    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
    }
}
