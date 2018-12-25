package com.steven.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//默认Controller里面的方法都以json格式输出
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(){
		System.out.println("HelloController.sayHello()");
		return "Hello World,"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	}
}
