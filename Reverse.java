package com.codingblock;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
