package com.tnsif.daythirteen.Queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeDemo {

	public static void main(String[] args) {
	Deque<String > deque1=new ArrayDeque<String>();
	deque1.add("Gautami");
	deque1.add("Kiran");
	
	System.out.println(deque1);
	
	deque1.pollLast();
	System.out.println(deque1);
	
	deque1.pollFirst();
	System.out.println(deque1);
	
	
	
	
	
	}

}
