/**
 * 
 */
package com.capgemini.shopping.TDDShop;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Tayo Ajoje
 * Shopping Cart Class
 */
public class ShoppingCart {

	private int itemCount;
	private double totalPrice;

	ArrayList<CartItem> shoppingCartList;



	public ShoppingCart(){
	    itemCount = 0;
	    totalPrice = 0.0;
	    shoppingCartList = new ArrayList<CartItem>();
	}

	
	/**
	 * Method to add to a cart
	 * @param cartitem
	 */

	public void addToCart(String product, double price, int inQuant){
	    CartItem item  = new CartItem( product,  inQuant,  price);
	    totalPrice += (price * inQuant);
	    shoppingCartList.add(item);
	    itemCount += 1;
	}

	/**
	 * @return the shoppingCartList
	 */
	public ArrayList<CartItem> getShoppingCartList() {
		return shoppingCartList;
	}


	public void addToCart2(String product){
		
		double price = getProductPrice(product);
	    CartItem item  = new CartItem( product,  1, price);
	    totalPrice += (price * 1);
	    shoppingCartList.add(item);
	    itemCount += 1;
	}
	
	

	
	public void createCart(List<String> cartlist){
		double price = 0;
		
		for (String product : cartlist) {
			 price = getProductPrice(product);
			    CartItem item  = new CartItem( product,  1, price);
			    totalPrice += (price * 1);
			    shoppingCartList.add(item);
			    itemCount += 1;
		}
		
	}
	/**
	 * Method to remove Item in a cart
	 * @param itemid
	 */
	public void removeItem(int itemid){
		
		  for (int i = 0; i < shoppingCartList.size(); i++) {
			  CartItem removeItem = (CartItem) shoppingCartList.get(itemid);
			  if (shoppingCartList.contains(itemid))
				{
				  shoppingCartList.remove(removeItem);
				}
			  
		    }

	}
	
	
	// method to get price of the product
	public double getProductPrice(String product){
	   double price = 0.0;
	   
		if(null != product){
			if(product.equalsIgnoreCase("APPLE")){
				price = 0.60;	 
		    }
			else if(product.equalsIgnoreCase("ORANGE")){
				price = 0.25;
			}
		}
		return price;
	}
	
	/**
	 * Method to calculate the cart
	 */
	public double calculateTotal(){
       Double totalPrice1 = 0.0;
		for (int i = 0; i<shoppingCartList.size(); i++)
		{
			CartItem item =  (CartItem) shoppingCartList.get(i);
			totalPrice1 += item.getQuantity() * item.getPrice();
		}
		return totalPrice1;
	}
	
  /**
   * Method to apply Discount
   * Offer 1: Apple : Buy one, get one free
   * Offer 2: Oranges : 3 for the price of 2
   */
  public double applyDiscount(){
	  
	  int appleCount = 0;
	  int orangeCount = 0;
	  
	    Double totalPrice1 = 0.00;
			for (int i = 0; i<shoppingCartList.size(); i++)
			{
				CartItem item =  (CartItem) shoppingCartList.get(i);
				if(item.getProduct().equalsIgnoreCase("APPLE") ){
					if(appleCount == 0){
					totalPrice1 += item.getQuantity() * item.getPrice();
					appleCount++;
					}
					else {
						appleCount = 0;	
					}
				}
				if(item.getProduct().equalsIgnoreCase("ORANGE") ){
					if(orangeCount < 2){
					totalPrice1 += item.getQuantity() * item.getPrice();
					orangeCount++;
					}
					else {
						orangeCount = 0;	
					}
				}
				
				
			
				
				
				//System.out.println("item.getQuantity()" + item.getQuantity() + " item.getPrice() : " + item.getPrice() + " Total is "+ totalPrice1);
			}
			System.out.println("Total is "+ totalPrice1);
			return totalPrice1;
			
	  
  }
	
}
