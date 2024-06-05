package com.oops;

class Person1 {
	
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
        return age;
    }
	
	void M_Person1()
	{
		System.out.println("M_Person1 method called:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Employee extends Person1 {
	
	private int EmployeeID;
	private double Salary;
	
	public Employee(String name, int age, int employeeid, double salary) {
		super(name,age);
		this.EmployeeID = employeeid;
		this.Salary = salary;
	}
	
	public int getEmployeeID() {
		return EmployeeID;
	}
	
	public double getSalary() {
        return Salary;
    }
	
	public void M_Employee()
	{
		super.M_Person1();
		System.out.println("M_Employee method called:");
		System.out.println("EmployeeID:"+EmployeeID);
		System.out.println("Salary:"+Salary);
	}
	
	
}

public class Person2 {
	
	public static void main(String args[])
    {
		Employee employee=new Employee("Sachin", 20, 1234, 10000);
        employee.M_Employee();
        
    }
	

}
