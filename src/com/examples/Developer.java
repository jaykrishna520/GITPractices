package com.examples;

public class Developer {

	private String name;
	private int salary;
	private int age;

	public Developer(String name, int salary, int age) {

		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {

		return "Name : " + this.name + " Salary : " + this.salary + " Age : " + this.age;
	}

}
