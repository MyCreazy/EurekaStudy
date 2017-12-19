package com.sl.ServiceConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient // 用于启动服务发现功能
@EnableFeignClients // 用于启动Fegin功能
@SpringBootApplication
public class ConsumerApp {

	/**
	 * main函数入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class);
	}
}
