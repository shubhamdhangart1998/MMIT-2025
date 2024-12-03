package com.tnsif.dayfive.multilevelinheritance;

public class Country {

	private String countryname;
	private String capital;
	
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//toSTring 
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	
	
	
	
	
	
}
