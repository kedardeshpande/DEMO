package com.test.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Helper {

		@Before("execution(public void com.test.demo.aop.Transaction.doTransaction())")
		public void logBegin()
		{
			System.out.println("transactino begin logged");
		}
		
		@After("execution(public void doTransaction())")
		public void logCommit()
		{
			System.out.println("transactino commit logged");
		}
}
