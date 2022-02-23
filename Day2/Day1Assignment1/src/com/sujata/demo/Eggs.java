package com.sujata.demo;

public class Eggs {

	private int totalEggs;
//	private int grossEggs;
//	private int dozenEggs;
//	private int remainingEggs;
	private EggUnit eggs;
	
	public Eggs(int totalEggs) {
		this.totalEggs = totalEggs;
		//Bussiness Logic for conversion
	}

	public EggUnit getEggs() {
		return eggs;
	}

	public void setEggs(EggUnit eggs) {
		this.eggs = eggs;
	}

//	public int getGrossEggs() {
//		return grossEggs;
//	}
//
//	public int getDozenEggs() {
//		return dozenEggs;
//	}
//
//	public int getRemainingEggs() {
//		return remainingEggs;
//	}

	
	
	
	
}
