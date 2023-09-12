package com.company;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic operators
        int a =  2;
        int b = 3;
        int c = a+b;
        System.out.println("answer is "+c);

        int q = 3;
        q += 4;
        System.out.println(q);


        double x = 2.1;
        double y = 8 % x; //module operator
        System.out.println(y);

        int n = 1;
        n += 4;    //
        System.out.println(n);

        // comparison operators
        System.out.println(7>9);

        // logical operators
        System.out.println(65>4 && 33>5);
        System.out.println(33>3 || 3>33);
        System.out.println();

        // bitwise operators
        System.out.println(3&3);

        // pre-increment operators
        int x1 = 7;
        int y1 = ++x1*8;
        System.out.println(y1);
    }
}
