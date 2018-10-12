package com.test.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.demo.vehicle.Vehicle;

public class AppAnnotationConfigXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();

		/*Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);*/
	}

}
