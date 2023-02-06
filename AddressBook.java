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
		  person.state = sc.nextLine();
		  System.out.println("enter zip code");
		  person.zip = sc.nextLine();
		  System.out.println("enter phone number");
		  person.phoneNumber = sc.nextLine();
		  System.out.println("enter email address");
		  person.email = sc.nextLine();
		  people.add(person);
		   }
	

	
			
			  
			 
	 public void deleteContact() {
		 
			String fName;
			String lName;
		 System.out.println("enter name of person whose contact has to be deleted");
		 
		 fName = sc.nextLine();
			lName = sc.nextLine();
			int flag =0;
			
			for(int i =0;i<people.size();i++) {
				AddressBook person = people.get(i);
				if(person.firstName.equals(fName)&&person.lastName.equals(lName)) {
		            	people.remove(person);
		            	System.out.println("person removed sucessfully");
		            }
		            else {
		            	System.out.println("contact not matched");
		            }
				}
			}
	
	
}
