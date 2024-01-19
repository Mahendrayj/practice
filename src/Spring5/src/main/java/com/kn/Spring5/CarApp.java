package com.kn.Spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("cofig.xml");
      Engine e1=(Engine)ctx.getBean("eng");
      System.out.println(e1);
      Engine e2=(Engine)ctx.getBean("eng2");
      System.out.println(e2);
      Car c=(Car)ctx.getBean("car1");
      System.out.println(c);
      
	}

}
