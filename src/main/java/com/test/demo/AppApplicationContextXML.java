package com.test.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.demo.vehicle.Vehicle;

/**
 * Hello world!
 *
 */
public class AppApplicationContextXML 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
        Vehicle obj = (Vehicle) context.getBean("car");
        obj.drive();
    }
}
