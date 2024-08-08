package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cconfige.xml");
         Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee.getAddress());
    }
}
