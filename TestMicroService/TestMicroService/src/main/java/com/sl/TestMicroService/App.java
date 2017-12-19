package com.sl.TestMicroService;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}
}
