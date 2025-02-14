package com.tnsif.daythirteen.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
	LinkedList <Integer> li=new LinkedList();
	
	li.add(10);
	li.add(20);
	li.add(40);
	//li.add("Sbc");
	
	System.out.println(li);
	
	li.addFirst(5);
	System.out.println(li);
	li.add(2, 60);
	System.out.println(li);
	
	li.addLast(03);
	System.out.println(li);
	
	
	System.out.println("first Elemets is :"+ li.getFirst());
	System.out.println(li.getLast());
	
	
	li.removeFirst();
	li.removeLast();
	System.out.println(li);
	
	Collections.sort(li);
	System.out.println("hhjhjvhbhn"+ li);
	
	ListIterator<Integer> ll=li.listIterator();
	while(ll.hasNext())
		System.out.print(ll.next()+"\t");
	
	System.out.println();
	
	ll=li.listIterator(li.size());
	while(ll.hasPrevious())
	{
		int n=ll.previous();
		System.out.print(n+"\t");
	}
		

	}

}
