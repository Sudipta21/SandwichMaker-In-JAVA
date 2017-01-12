package edu.albany.csi405;

import java.util.ArrayList;
import java.util.Scanner;


public class SandwichDriver {

	//making an instance of the sandwich maker class
	private static final SandwichMaker order1 = new SandwichMaker();
	private static Scanner userInput;   // creating an instance for the scanner 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();   //creating instance for customer class
		
		customer1.setId(1);   // setting the Id
		Cashier Jack = new Cashier(); // creating instance for customer class
		Jack.setPrice(5);    //Setting Regular Price for the Sandwich
		
		userInput = new Scanner(System.in); // Creating user Input
	
		System.out.println("Welcome To Our Store, May I know your Name, Please.");
		String uInput = userInput.nextLine();  //Taking User Input
		
		System.out.printf("Hey %6s would you like to have a regular Sandwich or a Special One%n", uInput);
		System.out.println("The Regular is $5 and the Special will depend on your number topings \n"
				+ "You can add as many topings as you want for $1 extra for each topings");
		int orderNumber = 0;    // To count a customer's order
		
		/*
		 *Creating an while loop so that customer can order more than once
		 *asking the user if he wants a regular or a special sandwich
		 *making the sandiwch and getting the price based on user decision
		 * 
		 */
		
		while(true){
			
			System.out.println("To have a Regular Sandwich Enter R to make your own Special Enter S.");
			uInput = userInput.nextLine();
			if(uInput.toLowerCase().equals("r")){ // checking if regular
				System.out.println("Your Sanwich will be ready within 7 minutes");
				if(orderNumber <1) // checking if it is the first order
				System.out.println("Your total amount is: $"+Jack.totalPrice(0));
				else   // if it's not counting the total price inclduing the first one and so on
					System.out.println("Your total amount is: $"+Jack.totalPrice(Jack.getPrice(order1.Order)));
				
			}else if(uInput.toLowerCase().equals("s")){   // if wants a special 
				
				takingOrder();   // calling the takingOrder method to takethe order
				order1.showOrder(); // once done showing what was the order
				System.out.println("Will be Ready Soon.\n Your Total is: $"+Jack.getPrice(order1.Order));
				if(orderNumber <1)                            // showing the price
					System.out.println("Your total amount is: $"+Jack.totalPrice(0));
					else
						System.out.println("Your total amount is: $"+Jack.totalPrice(Jack.getPrice(order1.Order)));
				
			}else{
				System.out.println("Please Follow The Instruction.");
			}
			System.out.println("To Make Another Order Enter A, or to quiet Enter Q");
			uInput = userInput.nextLine();   // checking if the user wanna make another order
			if(uInput.toLowerCase().equals("q"))
				break;
			orderNumber++;
		}
		
			
		}
		/*
		 * Showing all the ingredients available at the store 
		 * Asking user to choose from the menu
		 * Adding selected item to the order
		 * In this one can choose more than one toping at once 
		 * for example if one enter 123 it will select, 1 , 2 and 3 topings from the menu
		 * to split the 123 into 1,2, 3 using another method "digit"
		 * 
		 */
	
		public static void takingOrder(){
			System.out.printf("Please Select your Bread, \nSelect it By Entering the Number next to it.\n");
			order1.showBread();
			System.out.println("-------------------------------------");
			int uInput2 = userInput.nextInt();
			uInput2-=1;
			order1.addOrder(order1.bread, uInput2);
			
			
			
			
			
			System.out.println("Please select your Topings");
			order1.showTopings();
			System.out.println("-------------------------------------");
			System.out.println("You Can Choose more than one Topings at one time");
			System.out.println("To Select Chicken, Bacon and Onions at a time Enter: 134");
			uInput2 = userInput.nextInt();
			ArrayList<Integer> digit = digits(uInput2); // calling digit method
			
			for(int i = 0; i<digit.size();i++){
				order1.addOrder(order1.toping, digit.get(i)-1);
			}
			
			System.out.println("Please select your Cheese");
			order1.showCheese();;
			System.out.println("-------------------------------------");
			System.out.println("You Can Choose more than one Cheese at one time");
			System.out.println("To Select More than one Enter The number next to it here: ");
			uInput2 = userInput.nextInt();
			digit = digits(uInput2); // calling digit method
			
			for(int i = 0; i<digit.size();i++){
				order1.addOrder(order1.cheese, digit.get(i)-1);
			}
			
			
			
			System.out.println("Please Add Sauces");
			order1.showSauce();
			System.out.println("-------------------------------------");
			System.out.println("You Can Choose more than one Sauce at one time");
			System.out.println("To Select More than one Enter The number next to it here: ");
			uInput2 = userInput.nextInt();
			digit = digits(uInput2);  // calling digit method
			
			
			for(int i = 0; i<digit.size();i++){
				order1.addOrder(order1.sauce, digit.get(i)-1);
			}
			
			
		}
		/*
		 * This method split a whole integer into pieces
		 * for example it convert 1253 to 1, 2, 5, 3
		 * and store that into a ArrayList
		 * Send it back to the calling method
		 * @param int i; The number needs to be converted
		 */
		public static ArrayList<Integer> digits(int i){
			ArrayList<Integer> digits = new ArrayList<Integer>();
			while(i>0){
				digits.add(i%10);
				i/=10;
				
			}
			return digits;
		}

			
			
			
		
	}

	
	
		


