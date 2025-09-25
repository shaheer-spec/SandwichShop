package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size of the sandwich do you want (1 or 2)" +
                "\n1: Regular: base price $5.45 " +
                "\n2: Large: base price $8.95");
        int sandwich = scanner.nextInt();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        double basePrice = 0;
        double finalPrice;

        if (sandwich != 1 && sandwich !=2 ) {
            System.out.println("Invalid");
        } else if (sandwich == 1) {
            basePrice = 5.45;
        } else {
            basePrice = 8.95;
        }


        if (age <= 17) {
            finalPrice = basePrice * 0.9;
        } else if (age >= 65) {
            finalPrice = basePrice * 0.8;
        } else {
            finalPrice = basePrice;
        }

        System.out.printf("The Final Price is $%.2f", finalPrice);

/*        double finalSandwich = 0;

        if (sandwich == 1){
            finalSandwich = 5.45;
        } else if (sandwich == 2) {
            finalSandwich = 8.95;
        } else {
            System.out.println("Wrong value pick either 1 or 2");
        }

        System.out.println("What is your age?" );
        int age = scanner.nextInt();

        double finalPrice;

        if (age >= 18 && age < 65) {
            finalPrice = finalSandwich;
        } else if (age < 18) {
            finalPrice = finalSandwich * 0.9;
        } else {
            finalPrice = finalSandwich * 0.8;
        }
        System.out.println("Your Sandwich costs: $" + finalPrice);*/

    }
}
