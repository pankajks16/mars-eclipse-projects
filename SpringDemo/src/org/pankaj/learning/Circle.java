package org.pankaj.learning;

public class Circle {
	private String type;
	private int radius;
	//private String hello; // If we create this new hello variable, then we need to have a setter for this to get initialized.
							// else it will throw error in console and also we need getter to used this value in other classes.
	
	public Circle() {
		
	}
	
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

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println(getType() + " Circle is drawn");
	}
}
