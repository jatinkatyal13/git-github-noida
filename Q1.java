package com.codingblock;

import java.util.Scanner;

public class Q1 {

    public static boolean palindrome(String line){

        for (int i = 0; i <=line.length()/2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i -1)){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        boolean p = palindrome(line);
        System.out.println(p);

    }
}
