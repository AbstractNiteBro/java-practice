package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("enter age between 3 , 18 , 25 , 60 : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        switch (age) {
            case 3  -> System.out.println("Hello baby");
            case 18 -> System.out.println("You are adult now");
            case 25 -> System.out.println("lets have some party tonight");
            case 60 -> System.out.println("you are going to retire");
            default -> System.out.println("Are you blind, Please enter valid choice");
        }
    }
}
