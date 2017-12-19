package com.sl.ServiceConsumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("microservice-provider-user")
public interface ConsumerClient {
	// @RequestMapping(method = RequestMethod.GET, value = "/add")
	// Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value =
	// "b") Integer b);

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	String test();
}
