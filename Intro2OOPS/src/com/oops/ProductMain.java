package com.oops;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xyz = new XYZ();

        // Accepting product information from the user
        Product[] products = xyz.acceptProducts();

        // Finding PID of the product with the highest price
        int highestPricePid = xyz.findHighestPricePid(products);
        System.out.println("PID of the product with the highest price: " + highestPricePid);

        // Calculating total amount spent on all products
        double totalAmountSpent = xyz.calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);


	}

}

//Output of the program:

//Enter product ID, price, and quantity for product 1:
//1
//1000
//10
//Enter product ID, price, and quantity for product 2:
//2
//2000
//20
//Enter product ID, price, and quantity for product 3:
//3
//3000
//30
//Enter product ID, price, and quantity for product 4:
//4
//500
//5
//Enter product ID, price, and quantity for product 5:
//5
//200
//1
//PID of the product with the highest price: 3
//Total amount spent on all products: $142700.0

