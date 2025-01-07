package com.tnsif.dayeight.interfacedemo;

public class Bankdemo {

	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount("Sanika", "Pune", 12345, 17500);
		
		s1.deposit(20000);
		System.out.println(s1);

		s1.withdraw(10000);
		System.out.println(s1);
		
		s1.withdraw(3000);
		System.out.println(s1);
	}

}
