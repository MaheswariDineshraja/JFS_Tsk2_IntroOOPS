package com.oops;

public class Person {
	
	// Default age of person should be 18
	int age;	
	// object initialized with name
	String name;
	
	//constructor with default age
	public Person(String name) {
		this.name=name;
		this.age=18;
	}
	
	
	//method to display name and age of person
	public void display()
	{			
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);		
		
	}
	
	//Main method
	public static void main(String[] args)
	{
		Person person=new Person("Maheswari");
		person.display();
				
	}	

}

// Output of the program:
//Name: Maheswari
//Age: 18
