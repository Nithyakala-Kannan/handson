package com.hcl;

public class Triangle extends Shape
{
  private double base,height;
   public Triangle(double base, double height) {
	super();
	this.base = base;
	this.height = height;
}
public void computeArea()
   {
	   area=(1/2)*base*height;
	   System.out.println("Area of Triangle is:"+area);
	   
   }
}
