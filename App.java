package com.capgemini.shopping.TDDShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ShoppingCart ourShoppingCart = new ShoppingCart();
	//	ourShoppingCart.addToCart("Apple", 0.60, 1);
	//	ourShoppingCart.addToCart("Apple", 0.60, 1);
	//	ourShoppingCart.addToCart("Oranges", 0.25, 1);
	//	ourShoppingCart.addToCart("Apple", 0.60, 1);
	
	//	ourShoppingCart.addToCart2("Apple");
	//	ourShoppingCart.addToCart2("Apple");
	//	ourShoppingCart.addToCart2("Oranges");
	//	ourShoppingCart.addToCart2("Apple");
		
		List<String> CartList = new ArrayList<String>();
		CartList.add("Apple");
		CartList.add("Apple");
		CartList.add("Apple");
		CartList.add("Apple");
		
		CartList.add("Orange");
		CartList.add("Orange");
		CartList.add("Orange");
//		CartList.add("Orange");
//		CartList.add("Orange");
//		CartList.add("Orange");

		ourShoppingCart.createCart(CartList);
		//ourShoppingCart.calculateTotal();
        ourShoppingCart.applyDiscount();
   }
    
    
}
