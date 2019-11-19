package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.demo.mapper") //扫描的mapper
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.example.demo")


public class ZuoyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuoyeApplication.class, args);
	}

}
