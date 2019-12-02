package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.demo.mapper") //扫描的mapper
@SpringBootApplication
@EnableAutoConfiguration//自动配置，不需要写spring的配置文件



public class ZuoyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuoyeApplication.class, args);
	}

}
