package com.hcl;

public class fixedAccount extends savingAccount
{

	private int lockingPeriod;
	fixedAccount()
	{
		
	}
	public fixedAccount(String accNumber,String accHolderName,double balance,double minimumBalance,int lockingPeriod) {
		super();
		this.lockingPeriod = lockingPeriod;
	}
	public int getLockingPeriod() {
		return lockingPeriod;
	}
	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}

	
}
