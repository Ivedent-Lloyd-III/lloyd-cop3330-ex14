package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 14
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double tax = 1.0;
        double totalTax = 0.0;

        double orderAmount = orderInput();
        double subtotal = orderAmount;

        System.out.print("What is the state? ");
        String State = in.next();


        if (State.equals("WI")) {

            tax = tax * 0.055;
            totalTax = orderAmount * tax;
            orderAmount = orderAmount + totalTax;

        }

        double orderRound = orderAmount * 100.0;
        int roundCost = (int) Math.ceil(orderRound);
        double costFinal = roundCost / 100.0;

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("The subtotal is $"+String.format("%.2f",subtotal));
        System.out.println(".");
        System.out.println("The tax is $" + totalTax + ".");


        System.out.print("The total is $");
        System.out.print(format.format(costFinal));
        System.out.print(".");

    }

    private static int orderInput() {

        System.out.print("What is the order amount? ");
        int orderInput = in.nextInt();

        return orderInput;

    }
}
