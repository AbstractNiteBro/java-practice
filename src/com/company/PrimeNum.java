package com.company;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
//        int num = 23;
//        boolean isPrime = true;
//
//        for( int i = 2; i < num ; i++){
//            if (num % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime)
//            System.out.println(num +" is a Prime number");
//        else
//            System.out.println(num+" is not a Prime number");
//    }
//}

//int i;
//        int n = 23;
//        boolean s = true;
//
//        for ( i = 2; i < n; i++) {
//            if (n % i == 0){
//                s = false;
//            break;
//        }
//    }
//            if (s)
//                System.out.println(n);
//


      //  find all Prime numbers

    //    public static void main (String[]args){
            System.out.print("enter any number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print("these are Prime numbers : ");
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.print(i + ",");

            }

        }
    }
