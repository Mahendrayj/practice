package com.kn.Spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext crt=new ClassPathXmlApplicationContext();
		Employee e1=(Employee)crt.getBean("emp");
		System.out.println(e1);
	}

}
