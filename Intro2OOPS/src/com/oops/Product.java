package com.oops;

import java.util.Scanner;

public class Product {
	
	private int pid;
	private double price;
	private int quantity;
    
    // Class with Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class XYZ {
    // Method to accept five product information from the user and store in an array
    public Product[] acceptProducts() {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID, price, and quantity for product " + (i + 1) + ":");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        return products;
    }

    // Method to find PID of the product with the highest price
    public int findHighestPricePid(Product[] products) {
        double highestprice = Double.MIN_VALUE;
        int FindPid = -1;

        for (Product product : products) {
            if (product.getPrice() > highestprice) {
            	highestprice = product.getPrice();
            	FindPid = product.getPid();
            }
        }

        return FindPid;
    }

    // Method to calculate and return the total amount spent on all products
    public double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}


