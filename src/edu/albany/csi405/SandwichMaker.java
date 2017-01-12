package edu.albany.csi405;

import java.util.ArrayList;

import java.util.EnumSet;



@SuppressWarnings("unused")
public class SandwichMaker {
	
	//Four Arrays to hold all Ingredients
	//FOr topings, Sauce, bread, Cheese
	
	public String[] toping = {"Chicken", "Beef", "Bacon", "Onions","GreenPepper", "Tomatoes", "Letus", "Pickle", "Jalapeno"};
	
	public String[] sauce = {"Ketchup", "BBQ", "Honey_BBQ", "Mustard", "Honey_Mustard", "Hot_Sauce"};
	public String[] bread = {"Nine_Grain_Wheat bread", "Nine_Grain_Honey_Oat bread", "Italian bread", "Italian_Herbs_Cheese bread", "Flat Bread"};
	public String[] cheese = {"American Cheese", "Feta Cheese", "Mozarella Cheese"};
	
	//An Array list to get  the order
	ArrayList<String> Order = new ArrayList<String>();
	
	


	//To show Toping to the User
	public void showTopings(){
		
		for(int i = 0; i<toping.length;i++)
			System.out.printf("%-25s %-20d\n",toping[i], i+1);
	}
	
	//To show Bread to the User
	public void showBread(){
		
		for(int i = 0; i<bread.length;i++)
			System.out.printf("%-30s %-20d\n",bread[i], i+1);
	}
	
	//To show Sauce to the User
	public void showSauce(){
	
		for(int i = 0; i<sauce.length;i++)
			System.out.printf("%-25s %-20d\n",sauce[i], i+1);	
	}
	
	//To show Cheese to the User
	public void showCheese(){
		for(int i = 0; i<cheese.length;i++)
			System.out.printf("%-25s %-20d\n",cheese[i], i+1);	
	}
	
	//Adding Order to the order Arraylist
	public void addOrder(String[] a, int x){
		Order.add(a[x]);
		
	}
	
	//To show the whole order to the User
	public void showOrder(){
		System.out.println("Your Sandwich with:" +Order.toString());
		
	}
	
	


}

