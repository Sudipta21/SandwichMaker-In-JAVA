package edu.albany.csi405;

import java.util.ArrayList;

public class Cashier {
	
	private double price; // the price of the sandwich

	
	
	public double getPrice() { //accessor of the price
		
		return price;
	}
	public void setPrice(double price) { //mutator of the price
		this.price = price;
	}
	
	public double getPrice(ArrayList<String> order){  //Counting price for special sandwich
		if(order.size()>5){
			double extraMoney = order.size()-5;
			price += 5+extraMoney;
			return price;
			
		}else
			return price;
		
	}
	
	public double totalPrice(double ordersPrice){ //counting totalPrice
		price+=ordersPrice;
		return price;
	}
	
	
	
	
	
	
	
}
