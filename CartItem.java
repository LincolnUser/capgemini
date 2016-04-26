/**
 * 
 */
package com.capgemini.shopping.TDDShop;

/**
 * CartItem Class
 * @author Tayo Ajoje
 *
 */
public class CartItem {
	private String product;
	private int quantity;
	private double price;
 
	//constructor
	public CartItem()
	{
		product = "";
		quantity = 0;
		price = 0.0;
	}
 
	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	//constructor with parameters
	public CartItem(String inProduct, int inQuant, double inPrice)
	{
		this.product = new String(inProduct);
		this.quantity = inQuant;
		this.price = inPrice;
	}
	
	

	//getter setter public methods for each instance data
	
	
	public boolean equals(CartItem item)
	{
		//write the code for the equals method
		//return true;
		boolean result = false;
		if (this.product.equalsIgnoreCase(item.getProduct()) && this.price == item.getPrice())
			result = true;
		else
			result = false;
 
		return result;
	}
 

	@Override
	public String toString()
	{
		//write code for toString method
		String result="";
 
		return result;
	}
}
