package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accName,accNo,bankName;
		String tinNumber;
		String orgName;
		int no;
		String details;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		no=sc.nextInt();
		sc.nextLine();
		switch(no)
		{
		case 1:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
		    details=sc.nextLine();
		    
		    String  items[]=details.split(",");
		    
		    accName=items[0];
		    accNo = items[1];
		    bankName=items[2];
		    orgName=items[3];
		    savingsAccount sa=new savingsAccount();
		    sa.setAccName(accName);
		    sa.setAccNo(accNo);
		    sa.setBankName(bankName);
		    sa.setOrgName(orgName);
		    sa.display();
		    break;
		case 2:
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			details=sc.nextLine();
		    items=details.split(",");
		    accName=items[0];
		    accNo=items[1];
		    bankName=items[2];
		    tinNumber=items[3];
		    currentAccount ca=new currentAccount();
		    ca.setAccName(accName);
		    ca.setAccNo(accNo);
		    ca.setBankName(bankName);
		    ca.setTinNumber(tinNumber);
		    ca.display();
		    break;
		   default:
			   System.out.println("There is no option like this") ;
		           break;
		    
			
		}
		
		

	}

}
