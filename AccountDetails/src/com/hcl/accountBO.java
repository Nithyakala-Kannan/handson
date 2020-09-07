package com.hcl;

public class accountBO extends fixedAccount
{
	 
	accountBO()
	  {
		  super();

	  }
	public void  getAccountDetail(String detail)
	{
		String[] items=detail.split(",");
		fixedAccount fa=new fixedAccount();
	
	   accName = items[0];
		balance = Double.parseDouble(items[1]);
		accHolderName = items[2];
		minimumBalance = Double.parseDouble( items[3]);
		lockingPeriod =Integer.parseInt( items[4]);
		
	}
	
	  
		
    }


