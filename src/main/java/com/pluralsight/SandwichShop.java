package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What size of the sandwich do you want (1 or 2)" +
                "\n1: Regular: base price $5.45 " +
                "\n2: Large: base price $8.95");
        int sandwich = scanner.nextInt();

        double finalSandwich = 0;

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
        System.out.println("Your Sandwich costs: $" + finalPrice);

    }
}
