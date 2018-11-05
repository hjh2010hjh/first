package com.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
// 标识当前服务是Eureka客户端（服务提供者，服务消费）
// 当前这个应用是一个服务提供者的客户端
@EnableEurekaClient
@EnableDiscoveryClient
public class comsumer {
    public static void main(String[] args) {
        SpringApplication.run(comsumer.class);
    }

@Bean
@LoadBalanced
//负债均衡
public RestTemplate gettemplate(){
        return new RestTemplate();
}

}
