package com.steven.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

//默认Controller里面的方法都以json格式输出
@RestController
//启动类注解
@SpringBootApplication
public class ExcuteService {

	public static void main(String[] args) {
		System.out.println("启动服务的入口...");
		SpringApplication.run(ExcuteService.class,args);
	}
}
