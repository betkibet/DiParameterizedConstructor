package com.clc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("com/clc/resources/config.xml");
		Farmer fm = (Farmer) ct.getBean("farmer");
		fm.printAnimal();

	}

}
