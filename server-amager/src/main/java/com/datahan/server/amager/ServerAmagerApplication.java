package com.datahan.server.amager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jim Han
 */
@SpringBootApplication
@ComponentScan("com.datahan.*")
@EnableEurekaClient
public class ServerAmagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerAmagerApplication.class, args);
    }

}
