package com.cbt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cbt.bean.Hello;

public class Test {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Hello hello = (Hello) context.getBean("hello");
	hello.show();
    }

}
