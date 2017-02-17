package com.cbt.bean;

public class Hello {
    private String name;
    
    public Hello() {
	System.out.println("创建Hello对象");
    }

    public void setName(String name) {
	this.name = name;
    }

    public void show() {
	System.out.println("hello," + name);
    }
}
