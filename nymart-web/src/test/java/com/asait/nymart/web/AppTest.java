package com.asait.nymart.web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testFactoryMethod(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = context.getBean("myConnection");
		Object bean2 = context.getBean("myConnection");
		System.out.println(bean.getClass().getName()+"--"+bean);
		System.out.println(bean2.getClass().getName()+"--"+bean2);
	}
	
	@Test
	public void testFactoryBean(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = context.getBean("messageProductor");
		Object bean2 = context.getBean("messageProductor");
		System.out.println(bean.getClass().getName()+"--"+bean);
		System.out.println(bean2.getClass().getName()+"--"+bean2);
	}
}
