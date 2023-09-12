package com.company;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        System.out.println("enter the string");
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print("the reverse string is = ");
        for(int i = str.length();i>0;--i){
            System.out.print(str.charAt(i-1));
        }
    }
}
