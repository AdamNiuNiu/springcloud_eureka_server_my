package com.adam.eureka_server_my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerMyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMyApplication.class, args);
    }

}
