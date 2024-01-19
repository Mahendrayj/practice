package com.kn.Spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
      Employee e1=(Employee)ctx.getBean("emp");
      System.out.println(e1);
      Employee e2=(Employee)ctx.getBean("emp2");
      System.out.println(e2);
      CompanyXYZ cmt=(CompanyXYZ)ctx.getBean("cmp");
      System.out.println(cmt);
      
	}

}
