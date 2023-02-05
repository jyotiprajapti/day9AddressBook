package com.practice.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	 AddressBook person = new AddressBook();
	 ArrayList <AddressBook> people = new ArrayList<AddressBook>();
	 Scanner sc = new Scanner(System.in);
	 String firstName;
	 String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNumber;
		String email;
		
	public void addContact() {
		 System.out.println("enter first name");
		  person.firstName = sc.nextLine();
		  System.out.println("enter last name");
		  person.lastName = sc.nextLine();
		  System.out.println("enter address");
		  person.address = sc.nextLine();
		  System.out.println("enter city name");
		  person.city= sc.nextLine();
		  System.out.println("enter state");
		  person.state = sc.nextLine();s
		  System.out.println("enter zip code");
		  person.zip = sc.nextLine();
		  System.out.println("enter phone number");
		  person.phoneNumber = sc.nextLine();
		  System.out.println("enter email address");
		  person.email = sc.nextLine();
		  people.add(person);
		  
		 
	 }
	
}
