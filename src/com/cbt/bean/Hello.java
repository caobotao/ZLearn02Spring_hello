package com.cbt.bean;

public class Hello {
	private String name;

	public void setUsername(String name) {
	    this.name = name;
	}
	
	public void show(){
	    System.out.println("hello," + name);
	}

}
