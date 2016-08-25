package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.Cat;
import com.bean.Dog;

public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext ac =new FileSystemXmlApplicationContext(new String[]{"src/applicationContext.xml"});
		Dog d = (Dog) ac.getBean("dog");
		d.eat();
		d.la();
		Cat c = (Cat)ac.getBean("cat");
		c.eat();
		c.la();
	}
}
