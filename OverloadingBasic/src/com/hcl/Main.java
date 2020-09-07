package com.hcl;
import java.util.*;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,detail,ownerName;
		String stallType;
		int sqaureFeet,numberOfTv;
		char yesno;
		double cost;
		Stall s=new Stall();
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the stall:");
		name=sc.nextLine();
		System.out.println("Enter the  owner name of the stall:");
		ownerName=sc.nextLine();
		System.out.println("Enter the type of the stall:");
		stallType=sc.nextLine();
		System.out.println("Enter the size of the stall in sqaurefeet:");
		sqaureFeet=sc.nextInt();
		sc.nextLine();
		System.out.println("Does the hall have the TV?");
		yesno=sc.next().charAt(0);
		if(yesno=='y')
		{
			System.out.println("Enter the no of TV:");
			numberOfTv=sc.nextInt();
	        
			if(stallType=="Platinum")
			{
				
		       cost= s.computeCost(200,numberOfTv,sqaureFeet);
		       System.out.println("The cost is"+cost);
			}
			else if(stallType=="Diamond")
			{
				
			       cost= s.computeCost(150,numberOfTv,sqaureFeet);
			       System.out.println("The cost is"+cost);
				}
			else if(stallType == "Gold")
			{
				
			       cost= s.computeCost(100,numberOfTv,sqaureFeet);
			       System.out.println("The cost is"+cost);
				}
			
		}
		else
		{
			sc.nextLine();
		}
		
		
		
	}

}
