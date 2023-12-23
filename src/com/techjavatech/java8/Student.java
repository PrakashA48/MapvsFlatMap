package com.techjavatech.java8;

public class Student {
	 // id will act as Key 
    private Integer id; 
  
    // name will act as value 
    private String name; 
    
    public Student() {
		System.out.println("inside 0 param constructor");
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
    

}
