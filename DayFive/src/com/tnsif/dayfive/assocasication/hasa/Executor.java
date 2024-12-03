package com.tnsif.dayfive.assocasication.hasa;

public class Executor {

	public static void main(String[] args) {


		Address address=new Address("405 Laxmi nagar", "Pune", "maharashtra", "411001");
		
		Person person=new Person("Hema", address);
		person.displayinfo();
		System.out.println(person);

	}

}
