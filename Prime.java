package com.codingblock;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                break;
            }
            c = c + 1;
        }

        if (c * c > n) {
            System.out.println("  prime");
        } else {
            System.out.println("not prime");
        }
    }
}