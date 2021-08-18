package com.bridglab.objectoriented;
import java.util.Scanner;

public class InventoryDataManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many inventories you want to add");
		int n = sc.nextInt();
		InventoryData arr [] =new InventoryData[n];
		String name;
		int weight,price;
		for(int i =0;i<n;i++) {
			System.out.println("enter inventory to add");
			name = sc.next();
			System.out.println("enter the weight");
			weight = sc.nextInt();
			System.out.println("enter price of inventory");
			price = sc.nextInt();
			arr[i]= new InventoryData(name,weight,price);
		}
		for (int i =0;i<n;i++) {
			arr[i].total();
		}
		

	}

}
