package com.company;

public class Main {

    //    Write a recursive static method that computes the value of ln (N !)

    public static void main(String[] args) {
        // write your code here
        System.out.println(factorial(7));
        System.out.println(Math.log(factorial(7)));
    }

    public static int factorial(int n) {
        if ( n == 0 ) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
