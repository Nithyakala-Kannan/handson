package com.hcl;

public class currentAccount extends Account
{

	private String tinNumber;
	currentAccount()
	{
		
	}
	public currentAccount(String accName,String accNo,String bankName,String tinNumber) 
	{
		super();
		this.tinNumber = tinNumber;
	}
	
	
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public void display()
	{
		super.display();
		System.out.println("TIN Number:"+tinNumber);
	}
	
}
