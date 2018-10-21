package com.codingblock;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int a = -1;
        int b = 1;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {

            int c = a + b;
            a = b;
            b = c;

            if (c <= n) {

                System.out.println(c);
            }
        }
    }
}
