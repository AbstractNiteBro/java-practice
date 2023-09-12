package com.company;

import java.util.Scanner;

public class CheckLeapYear {

public static void main(String[] args) {
    System.out.print("Enter any year = ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    boolean leap = false;

   if ( year % 4 == 0) {
       if (year % 100 == 0) {
           leap = year % 400 == 0;
       }
       else leap = true;
   }
   else leap = false;

   if (leap)
       System.out.println(year + " is a leap year");
   else
       System.out.println(year + " is not a leap year");


  }
}