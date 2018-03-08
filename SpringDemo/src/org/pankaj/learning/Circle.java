package org.pankaj.learning;

public class Circle {
	private String type;
	private int radius;
	
	public Circle(String type) {
		this.type = type;
	}
	
	public Circle(String type, int radius) {
		this.type = type;
		this.radius = radius;
	}
	
	public String getType() {
		return type;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " Circle is drawn");
	}
}
