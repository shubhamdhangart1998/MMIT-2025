package com.tnsif.dayfive.multilevelinheritance;

public class MultiLevelInheritanceDemoDriver {

	public static void main(String[] args) {
		
		City c=new City();
		c.setCityname("Pune");
		c.setArea(1234.45f);
		c.setCapital("Delhi");
		c.setCountryname("india");
		c.setLanguage("marathi");
		c.setStateName("maharashtra");
		
		
		System.out.println(c);

	}

}
