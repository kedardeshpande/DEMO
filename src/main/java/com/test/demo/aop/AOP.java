package com.test.demo.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.demo.config.Applicationconfig;

public class AOP {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Applicationconfig.class);
		Transaction t = context.getBean(Transaction.class);
		t.doTransaction();

	}

}
