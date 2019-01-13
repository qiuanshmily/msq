package com.msq.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.msq.provider.mapper")
public class HichatProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HichatProviderApplication.class, args);
    }

}
