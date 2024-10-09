package com.tnsif.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {

		char userInput='S';
		
		switch(userInput)
		{
		case 'a':
		case 'A' :
			System.out.println(userInput+ "  for Apple");
			break;
			
		case 'b':
		case 'B' :
			System.out.println(userInput+ "  for Box");
			break;
		
		case 'c':
		case 'C' :
			System.out.println(userInput+ "  for Cat");
			break;	
			
		case 'd':
		case 'D' :
			System.out.println(userInput+ "  for Dog");
			break;
			
		default:
			System.out.println(userInput + "  is other letter, plzz put the letters between A-d");
			break;
		}
		
	}

}
