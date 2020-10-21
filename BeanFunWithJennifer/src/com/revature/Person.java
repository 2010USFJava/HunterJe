package com.revature;

public class Person {

	private String name;
	private String sex;
	private int weight;
	
	public Person() {
	}

	public Person(String name,String sex,int weight) {
		this.name=name;
		this.sex=sex;
		this.weight=weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", weight=" + weight + "]";
	}
	
	
}
