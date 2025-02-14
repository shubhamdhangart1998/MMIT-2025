package com.tnsif.daythirteen.setdemo;

public class Student {

	
	private int id;
	private String name;
	private double per;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
