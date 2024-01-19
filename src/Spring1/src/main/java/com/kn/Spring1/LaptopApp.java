package com.kn.Spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp {

	public static void main(String[] args) {
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
       Laptop Lt1= (Laptop)ctx.getBean("Lt");
       System.out.println(Lt1);
	}

}
