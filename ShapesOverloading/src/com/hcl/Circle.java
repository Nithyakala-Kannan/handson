package com.hcl;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void computeArea()
	{
		area=(22/7)*radius*radius;
		System.out.println("Area of circle is:"+area);
	}

}
