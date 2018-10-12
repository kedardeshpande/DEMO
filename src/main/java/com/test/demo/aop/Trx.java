package com.test.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class Trx {

	public void doTransaction()
	{
		System.out.println("dupliucate method");
	}
}
