package com.tnsif.dayseven.covarientoverriding;

//parent class 
class Colour{
	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
	}
}
//child class

class Red extends Colour{
	
	
	@Override
	protected Red getColour()
	{
		Red s=new Red();
		return s;
				
	}
}

class Yellow extends Colour{
	
	
	@Override
	protected Yellow getColour()
	{
		Yellow s=new Yellow();
		return s;
				
	}
}




public class CovarientOverridingDemo {

	public static void main(String[] args) {
		
		
		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Red r=new Red();
		System.out.println(r.getColour());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
