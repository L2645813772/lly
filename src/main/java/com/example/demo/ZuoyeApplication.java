package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.demo.mapper") //扫描的mapper
@SpringBootApplication



public class ZuoyeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuoyeApplication.class, args);
	}

}
