package com.company;

public class BitwiseOP {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("AND "+ (a & b));
        System.out.println("OR "+(a | b));
        System.out.println("XOR "+ (a ^ b));
        System.out.println("COMPLIMENT a = "+(~a)+", b = " +(~b));
    }
}