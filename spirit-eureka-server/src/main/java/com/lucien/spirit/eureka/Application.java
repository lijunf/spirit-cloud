package com.lucien.spirit.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;

/**
 * Eureka注册中心
 * 
 * @author lucien   
 * @date 2016年8月2日 下午9:37:50 
 * @version V1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
