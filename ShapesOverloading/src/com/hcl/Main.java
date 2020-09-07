package com.hcl;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		double radius,length,breadth,base = 0,height = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter shapes");
		System.out.println("1.Circle\n2.Rectangle\n3.Trangle");
		no=sc.nextInt();
		sc.nextLine();
		switch(no)
		{
		case 1:
			System.out.println("Enter the radius");
			radius=sc.nextDouble();
			Circle c=new Circle(radius);
			c.computeArea();
			break;
		case 2:
			System.out.println("Enter the length and breadth");
			length=sc.nextDouble();
			breadth=sc.nextDouble();
			Rectangle r=new Rectangle(length,breadth);
			r.computeArea();
			break;
		case 3:
			System.out.println("Enter the base and height");
			length=sc.nextDouble();
			breadth=sc.nextDouble();
			Triangle t=new Triangle(base,height);
			t.computeArea();
			break;
			
		default:
			System.out.println("There is no option like this");
		}
		
	}

}
