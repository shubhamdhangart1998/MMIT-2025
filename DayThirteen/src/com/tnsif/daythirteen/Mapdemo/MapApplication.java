package com.tnsif.daythirteen.Mapdemo;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class MapApplication {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		LinkedHashMap lp=new LinkedHashMap();
		do
		{
			System.out.println("1: Add new elements");
			System.out.println("2: Remove Elements");
			System.out.println("3: Search specific elements");
			System.out.println("4: View All Data");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the name of students");
				String name=sc.nextLine();
				System.out.println("Enter the id of students");
				int id =sc.nextInt();
				
				lp.put(id, name);
				System.out.println();
				break;
				
			case 2:
				System.out.println("enter the id of students ");
				id=sc.nextInt();
				
				boolean b=lp.containsKey(id);
				
				if(b)
				{
					Object val=lp.remove(id);
					System.out.println("deleted elements "+val);
				}
				else 
				{
					System.out.println("elemnts not found ");
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("Enter the id of student ");
				id=sc.nextInt();
				Object val=lp.get(id);
				
				if(val !=null)
				{
					System.out.println("Elements found "+val);
				}
				else
				{
					System.out.println("Elements not found ");
				}
				System.out.println();
				break;
				
			case 4:
			{
				System.out.println(lp);
//				Set keys=lp.keySet();
//				Iterator i=keys.iterator();
//				
//				while(i.hasNext())
//				{
//					Object key=lp.keySet();
//					val=lp.get(key);
//					System.out.println(key+ "   "+val+"\n");
//				}
				break;
			}
				
			case 5:
				System.exit(0);
				
				break;
				
				default:
				System.out.println("Wrong choice "+ "\n");
					
			}

		} while(true);

	}

}
