package com.tnsif.dayfive.multilevelinheritance;


//child of state indirect child of country 
public class City extends State{

	
	private String cityname;
	private float area;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
}
