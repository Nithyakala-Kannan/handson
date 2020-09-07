package com.hcl;

public class Stall {
	
	protected String name,detail,ownerName;
	double cost;
	Stall()
	{
		
	}
	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Double computeCost(String stallType,int squareFeet)
	{
		cost=Double.parseDouble(stallType)*(squareFeet);
		return cost;
	}
	
	public double computeCost(double stallType, int numberOfTv, int sqaureFeet) {
		
		// TODO Auto-generated method stub
		cost=(stallType)* sqaureFeet +(numberOfTv*10000);
		return cost;
		
	}
	
	
	

}
