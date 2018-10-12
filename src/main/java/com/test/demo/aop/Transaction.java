package com.test.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
	
	public void doTransaction()
	{
		System.out.println("transaction done");
	}
}
