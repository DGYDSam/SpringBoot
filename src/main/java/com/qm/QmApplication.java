package com.qm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot启动注解
@SpringBootApplication
public class QmApplication {
	
	/**
	 * Spring Boot 启动主函数
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(QmApplication.class, args);
	}
	
}
