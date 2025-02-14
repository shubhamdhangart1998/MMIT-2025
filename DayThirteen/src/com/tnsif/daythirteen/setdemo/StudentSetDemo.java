package com.tnsif.daythirteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
	
		Set<Student> set=new HashSet<Student>();
		
		set.add(new Student(1001, "hjshbchj", 45.76d));
		set.add(new Student(1002, "sghcvhj", 34.76f));
		
		System.out.println(set);

	}

}
