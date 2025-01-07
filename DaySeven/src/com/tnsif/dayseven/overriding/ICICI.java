package com.tnsif.dayseven.overriding;

public class ICICI extends RBI {

	@Override
	public float getRateofInterest()
	{
		
		System.out.println("This is the best ROI of ICICI bank ");
		return 7.2f;
	}
	
}
