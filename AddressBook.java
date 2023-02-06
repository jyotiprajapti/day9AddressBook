package com.practice.day9;

import java.util.ArrayList;
import java.util.Scanner;

import com.practice.encapsulation.AddressBook;

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
	 public void editContact() { String fName; String lName;
	 System.out.println("enter full name of person whose details are to be edited"
	 ); fName = sc.nextLine(); lName = sc.nextLine(); int flag =0; for(int i
	 =0;i<people.size();i++) { AddressBook person = people.get(i);
	 if(person.firstName.equals(fName)&&person.lastName.equals(lName)) { flag =1;
	 System.out.println("First Name : " + person.firstName);
	 System.out.println("Last Name  : " + person.lastName);
	 System.out.println("Address    : " + person.address);
	 System.out.println("City       : " + person.city);
	 System.out.println("State      : " + person.state);
	 System.out.println("Zip        : " + person.zip);
	 System.out.println("Phone Number:" + person.phoneNumber);
	 System.out.println("Email      : " + person.email);
	 System.out.println("---------------------------------------"); System.out.
	 println("Enter the number which you want to edit\n1.First Name\n2.Last Name\n3.Address\n4.C\n5.State\n6.Zip\n7.Phone Number\n8.Email"
	 );

	 int choose; choose = sc.nextInt(); switch(choose) {

	 case 1: System.out.println(" First Name "); firstName= sc.nextLine();
	 System.out.println("edited successfully"); break; case 2:
	 System.out.println(" Last name "); lastName= sc.nextLine();
	 System.out.println("edited successfully"); break; case 3:
	 System.out.println("address "); address = sc.nextLine();
	 System.out.println("edited successfully"); case 4:
	 System.out.println(" city:"); city = sc.nextLine();
	 System.out.println("edited successfully"); case 5:
	 System.out.println("state "); state = sc.nextLine();
	 System.out.println("edited successfully"); case 6:
	 System.out.println("zip "); zip = sc.nextLine();
	 System.out.println("edited successfully"); break; case 7:
	 System.out.println("phone number "); phoneNumber = sc.nextLine();
	 System.out.println("edited successfully"); break; case 8:
	 System.out.println("state "); state = sc.nextLine();
	 System.out.println("edited successfully"); break; case 9:
	 System.out.println("email "); email = sc.nextLine();
	 System.out.println("edited successfully"); break; default:
	 System.out.println("entered number is wrong "); }


	 }

	 } if (flag ==0) { System.out.println("address not found"); }

	 }

	 public void  dupilicateContact() {
			
		 for(int i =0; i<people.size();i++) {
		 AddressBook person = people.get(i);
		 for(int j =1; j<people.size();j++) {
			 AddressBook person2 = people.get(j);
			 if(person.firstName.equals(person2.firstName)&&person.lastName.equals(person2.lastName)) {
				 people.remove(person);
			 }
		 }
		 
	
}
