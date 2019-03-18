package com.vincent.hong.run;

import com.vincent.hong.CommonBootConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * MapperScan 加载所有需要映射的dao
 */
@SpringBootApplication
@ComponentScan( basePackageClasses = {CommonBootConfig.class})
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
