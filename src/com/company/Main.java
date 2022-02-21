package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void discount(double ...x) {
        System.out.println("How big the discount should be?: ");
        Scanner sc = new Scanner(System.in);
        double discountPercent = sc.nextDouble();
        discountPercent = discountPercent / 100;
        double pricePercent[] = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            pricePercent[i] = x[i] * discountPercent;
            System.out.println("The price of the items are: "+x[i]);
        }
        for (int i = 0; i < x.length; i++){
            x[i]-= pricePercent[i];
            System.out.println("The item at the index of "+i+"'s new price is with the discount: "+x[i]);
        }
    }

    public static void main(String[] args) {
        discount(230000, 70000, 14000);
    }
}
