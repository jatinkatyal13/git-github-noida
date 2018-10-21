package com.codingblock;

public class Largest {

    public static void main(String[] args) {
        int a = 12;
        int b = 25;
        int c = 9;
        int max = 0;

        if (a > b) {
            max = a;
        } else {
            max = b;

        }
        if (max < c) {
            max = c;
        }
        System.out.println(max );
    }
}
