package com.test.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.demo.annotation.model.Samsung;
import com.test.demo.config.Applicationconfig;

public class AppAnnotationConfigJAVA {
	public static void main(String srg[])
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Applicationconfig.class);
		Samsung s = context.getBean(Samsung.class);
		s.config();
		System.out.println(s);
	}
	
}
