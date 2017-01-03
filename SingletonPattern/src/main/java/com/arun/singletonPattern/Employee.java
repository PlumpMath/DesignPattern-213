package com.arun.singletonPattern;

 enum Employees {
	INSTANCE;
	
	public String getEmployee(){
		return "Emplyees";
	}

}

 public class Employee{
	public static void main(String[] args) {
		System.out.println(Employees.INSTANCE.hashCode());
	}
}
