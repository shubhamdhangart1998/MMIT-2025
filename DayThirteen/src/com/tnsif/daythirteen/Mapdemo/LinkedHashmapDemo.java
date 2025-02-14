package com.tnsif.daythirteen.Mapdemo;

import java.util.LinkedHashMap;

public class LinkedHashmapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap ht=new LinkedHashMap();
		ht.put(101, 10000);
		ht.put(102.f, 23.74);
		ht.put(203, "pune");
		ht.put(204, "pune");
		
		System.out.println(ht);
		
		System.out.println(ht.replace(204, "Mumbai"));
		System.out.println(ht);

	}

}
