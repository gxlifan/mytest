package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication标识的类为SpringBoot启动类
 * 启动类只能放在同一包中或者包的上一级中，放在包平级或者子包中都不会起作用
 * @author LIFAN
 *
 */

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

}
