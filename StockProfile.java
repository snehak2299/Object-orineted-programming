package com.bridglab.objectoriented;

public class StockProfile {
	public String stockName;
	public int noOfShare;
	public int priceOfShare;
	
	public StockProfile(String stockName, int noOfShare, int priceOfShare) { //constuctor 
		super();
		this.stockName = stockName;
		this.noOfShare = noOfShare;
		this.priceOfShare = priceOfShare;
	}
	
	public String toString() {
        return "StockAccount{" +
                "stockname='" + stockName + '\'' +
                ", noofshare=" + noOfShare +
                ", shareprice=" + priceOfShare +
                '}';
    }
	

}
