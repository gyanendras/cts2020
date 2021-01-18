package com.cts.cts2020;


public class lambdaTests {
	
	Employee emp = new Employee();
	
	
	public static void main(String[] args ) {
		Greetable gr = ()->{
			System.out.println("Hi to all");
		};
		
		Greetable gr1 = ()->{
			System.out.println("Hello All");
		}; 
		
		gr.greet();
		gr1.greet();
		
		Proceessable pr =(Person pr1, Car cr)->{
			return pr1.getName() + " has a " + cr.getName();
			
		};
		Person p = new Person("Mohan","Keswani");
		Car c = new Car("Honda");
		
		System.out.println(pr.process(p, c));
	}
	
	// lambda function that 
	// adds 2 number and returns sum - 
	// create a functional interface
	  // addable
	
	// supplier
	
	// predicate

}
