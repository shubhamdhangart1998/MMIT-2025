package com.tnsif.daythirteen.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		List list=new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Aniket");
		list.add("heti");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.41f);
		list.add(10);
		System.out.println("List is : "+ list);
		
		System.out.println(list .isEmpty());
		
		System.out.println(list.size());
		
		System.out.println(list.contains(100));
		
		list.remove(false);
		System.out.println(list);
		
		System.out.println(list.lastIndexOf(20));
		
		System.out.println(list.indexOf(20));
		
		//list.clear();
		System.out.println(list);
		
		System.out.println("-----------------");
		
		
		//generics
		
		
		List <String> names=new ArrayList<String>();
		names.add("ABC");
		//names.add(false);
		
		Collections.reverse(list);
		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
		

	}

}
