package com.coforge.day3;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee laasya = new Employee(1, "Laasya" ,10000);
		laasya.display();
		
		System.out.println();
		
		Employee lahari = new Employee(2, "Lahari" ,15000);
		lahari.display();
		
		laasya.setSalary(25000);
		laasya.getSalary();
		
	}
}
