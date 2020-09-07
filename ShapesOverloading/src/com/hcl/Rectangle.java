package com.hcl;

public class Rectangle extends Shape
{
	private double length,breadth;
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void computeArea()
	{
		area=length*breadth;
		System.out.println("Area of Rectangle is:"+area);
		
	}
	

}
