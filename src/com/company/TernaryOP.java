package com.company;

public class TernaryOP {
    public static void main(String[] args) {
        int a = 10, b =20;
        System.out.println((a>b) ? a : b);

        int i =10, j =20, k =30;

        System.out.println((i > j ) ? (i > k ? i : k ) : ( j > k ? j : k));
    }
}
