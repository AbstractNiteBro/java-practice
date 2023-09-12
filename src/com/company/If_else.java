package com.company;

import java.util.*;

public class If_else {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18 && age <= 70 )
            System.out.println("you can driver");
        else
            System.out.println("you can not drive");

        }
    }

