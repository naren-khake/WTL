package com.Q16;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String args[]) {
		
		BeanFactory context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = context.getBean("emp",Employee.class);
		
		System.out.println(emp);
		
		Employee emp2 = context.getBean("emp",Employee.class);
		
		if(emp == emp2) {
			System.out.println("SCOPE IS SINGLETON");
		}
		else {
			System.out.println("SCOPE IS PROTOTYPE");
		}
	}

}
