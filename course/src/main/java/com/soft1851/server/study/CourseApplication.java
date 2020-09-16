package com.soft1851.server.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/9/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

    /**
     * 创建 RestTemplate 实例并通过 @Bean 注解注入到 IoC 容器中
     *
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
