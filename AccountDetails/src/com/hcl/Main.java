package com.hcl;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accNumber,accHolderName;
		 double balance;
		 double minimumBalance;
		 int lockingPeriod;
		String detail;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter account details:");
		detail=sc.nextLine();
		accountBO ab=new accountBO();
		ab.getAccountDetail( detail);
		 
		fixedAccount fa=new fixedAccount();
		fa.setAccNumber(accNumber);
		fa.setBalance(minimumBalance);
		fa.setAccHolderName(accHolderName);
		fa.setBalance(minimumBalance);
		fa.setLockingPeriod(lockingPeriod);
		
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		System.out.println(fa.getAccNumber()+"\t"+fa.getBalance()="\t"+fa.getAccHolderName()+"\t"+fa.getMinimumBalance()+"\t"+fa.getLockingPeriod());
	}

}

