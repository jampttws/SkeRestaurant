package javaApplication;

/**
 * The Food class.
 * This class is used to get name and price of food. 
 * It can also get and add quantity.
 *
 * @author Tanasorn Tritawisup
 */

public class Food {
	String name;
	double price;
	int quantity = 0;
	
	public Food(String name,double price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void addQuantity(int add) {
		quantity += add;
	}
}
