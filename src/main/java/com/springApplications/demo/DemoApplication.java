package com.springApplications.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("Employees.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		Employee e2 = context.getBean("emp2", Employee.class);
		Employee e3 = context.getBean("emp3", Employee.class);

		System.out.println();
		System.out.println(e1);
		System.out.println("================");
		System.out.println(e2);
		System.out.println("================");
		System.out.println(e3);

	}



}
