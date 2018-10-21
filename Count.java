package com.codingblock;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                int num = s.nextInt();
        int result = 0;
        int count = 0;

        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            if(rem == 5)
            {
                count++;
            }
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}

