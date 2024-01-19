package com.kn.Spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ClassPathXmlApplicationContext cmt=new ClassPathXmlApplicationContext("config.xml");
     Mobile m1=(Mobile)cmt.getBean("mv1");
     System.out.println(m1);
     Mobile m2=(Mobile)cmt.getBean("mv2");
     System.out.println(m2);
     Person per=(Person)cmt.getBean("per1");
     System.out.println(per);
	}

}
