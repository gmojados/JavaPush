package firstpush;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the product?");
        String WhatProduct = scan.next();
        System.out.println("What Quantity of" + " " + WhatProduct);
        int quantity = scan.nextInt();
        System.out.println("How many miles are you from headquarters?");
        int distance = scan.nextInt();
        int fee1 = 2;
        int fee2 = 5;
        int fee3 = 10;
        int fee4 = 15;
        int fee5 = 20;
        double ProductPrice = 5.0;
        if (distance >= 0 && distance <=4) {
            System.out.println("Your total including delivery will be " + fee1 + ProductPrice * quantity);
        }else if (distance >= 5 && distance <= 15) {
            System.out.println("Your total including delivery will be " + fee2 + ProductPrice * quantity);
        }else if (distance >= 16 && distance <= 25) {
            System.out.println("Your total including delivery will be " + fee3 + ProductPrice * quantity);
        }else if (distance >= 26 && distance <= 50) {
            System.out.println("Your total including delivery will be " + fee4 + ProductPrice * quantity);
        } else {
            System.out.println("Your total including delivery will be " + fee5 + ProductPrice * quantity); }



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