package com.cbt.bean;

public class Hello {
    private String name;
    
    public Hello() {
	System.out.println("����Hello����");
    }

    public void setName(String name) {
	this.name = name;
    }

    public void show() {
	System.out.println("hello," + name);
    }
}
