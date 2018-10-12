package com.test.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.test.demo.annotation.model.Samsung;

@Configuration
@ComponentScan(basePackages= {"com.test.demo.annotation.model","com.test.demo.annotation.model","com.test.demo.aop"})
public class Applicationconfig {
	
}
