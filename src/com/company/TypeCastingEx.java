package com.company;

public class TypeCastingEx {

    public static void main(String[] args) {
        int a = 10;     //4 Bytes
        double b = a;       //8 Bytes
        System.out.println(b);

        double d = 10.5;     //4 Bytes
        int i = (int)d;       //8 Bytes
        System.out.println(i);
    }
}
