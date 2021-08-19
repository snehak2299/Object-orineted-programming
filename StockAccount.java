package com.bridglab.objectoriented;
import java.util.Scanner;

public class StockAccount {
	public StockProfile[] stocks; // to storing company stocks
	public Scanner sc = new Scanner(System.in);
	
	public void StockPortfolio() { // how many company you want to add
		System.out.println("Enter number of companies: ");
		int company = sc.nextInt();
		stocks = new StockProfile[company];
		addcompany();
	}
	
	public void addcompany() { //add name of company and shares
		for(int i=0;i<stocks.length;i++) {
			System.out.println("Enter Stock name: ");
			String dummy = sc.nextLine();
			String stock = sc.nextLine();
			System.out.println("Enter number of shares: ");
			int shares = sc.nextInt();
			System.out.println("Enter share price: ");
			int price = sc.nextInt();
			stocks[i]=new StockProfile(stock,shares,price);
			
		}
	}
	public void printReport() { // display balance and list stocks
		int totalvalue = 0;
		System.out.println();
		for (int i=0; i<stocks.length; i++) {
			int value = stocks[i].priceOfShare*stocks[i].noOfShare;
			totalvalue += value;
			System.out.println("Stock Name: " + stocks[i].stockName + "\nNumber Of Shares: " + stocks[i].noOfShare + "\nsharePrice: " + stocks[i].priceOfShare +"\nTotal share price: " + value );
			System.out.println("\n");
		}
		System.out.println("Total value of Stocks : "+totalvalue);
	}
	public void buyStock(){ // to buy stocks
		System.out.println("for which company do you want to buy stocks");
		Scanner sc2 = new Scanner (System.in);
		String company = sc2.next();
		for(int i =0;i<stocks.length;i++) {
			String confirm =(String)this.stocks[i].stockName;
			if(confirm.equals(company)) {
				System.out.println("how many stocks you want to buy");
				int stockBuy = sc2.nextInt();
				stocks[i].noOfShare+=stockBuy;
			}
		}
	}
	public void sellStock() { //to sell the stocks
		System.out.println("for which company do you want to sell stocks");
		Scanner sc3= new Scanner (System.in);
		String company = sc3.next();
		for(int i =0;i<stocks.length;i++) {
			String check = (String)this.stocks[i].stockName;
			if(check.equals(company)) {
				System.out.println("how many stocks you want to sell");
				int stockSell=sc3.nextInt();
				stocks[i].noOfShare-=stockSell;
			}
		}
	}
	public static void main(String[] args) {
		StockAccount oj = new StockAccount();
		Scanner sc1 = new Scanner (System.in);
		while(true) {
		System.out.println("Enter your option"+"\n1) Add the stocks"+"\n2)print report"+"\n3)buy stocks"+"\n4) sell stocks");
		int option = sc1.nextInt();
			switch(option) {
			case 1:
				oj.StockPortfolio();
				break;
			case 2:
				oj.printReport();
			case 3:
				oj.buyStock();
				break;
			case 4:
				oj.sellStock();
				break;
			}
		}
		
	}

}
