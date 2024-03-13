package firstpush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the product?");
        String WhatProduct = scan.next();
        System.out.println("What Quantity of" + " " + WhatProduct);
        double quantity = scan.nextInt();
        System.out.println("How many miles are you from headquarters?");
        int distance = scan.nextInt();

        long fee1 = 2;
        long fee2 = 5;
        long fee3 = 10;
        long fee4 = 15;
        long fee5 = 20;


        double ProductPrice = 5.0;
        double TotalWDelivery1 = ProductPrice * quantity + fee1;
        double TotalWDelivery2 = ProductPrice * quantity + fee2;
        double TotalWDelivery3 = ProductPrice * quantity + fee3;
        double TotalWDelivery4 = ProductPrice * quantity + fee4;
        double TotalWDelivery5 = ProductPrice * quantity + fee5;

        if (distance >= 0 && distance <=4) {
            System.out.println("Your total including delivery will be " + TotalWDelivery1 + " " + "Thank you for shopping with us :)");
        }else if (distance >= 5 && distance <= 15) {
            System.out.println("Your total including delivery will be " + TotalWDelivery2 + " " + "Thank you for shopping with us :)");
        }else if (distance >= 16 && distance <= 25) {
            System.out.println("Your total including delivery will be " + TotalWDelivery3 + " " + "Thank you for shopping with us :)");
        }else if (distance >= 26 && distance <= 50) {
            System.out.println("Your total including delivery will be " + TotalWDelivery4 + " " + "Thank you for shopping with us :)");
        } else {
            System.out.println("Your total including delivery will be " + TotalWDelivery5 + " " + "Thank you for shopping with us :)"); }



        /*


        String Product = "Rice";
        int quantity = 20;
        double ricePrice = 5.0;
        double distance = 10;

        int fee1 = 2;
        int fee2 = 5;
        int fee3 = 10;
        int fee4 = 15;
        int fee5 = 20;



        if (distance >= 0 && distance <=4) {
            System.out.println(fee1 + ricePrice * quantity);

        }else if (distance >= 5 && distance <= 15) {
            System.out.println(fee2 + ricePrice * quantity);
        }else if (distance >= 16 && distance <= 25) {
            System.out.println(fee3 + ricePrice * quantity);
        }else if (distance >= 26 && distance <= 50) {
            System.out.println(fee4 + ricePrice * quantity);
        } else {
            System.out.println(fee5 + ricePrice * quantity); } // Remember curly braces

         */





    } // end method
}