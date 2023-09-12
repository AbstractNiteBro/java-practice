package com.company;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) {

        System.out.println("enter no.of rows : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int i, j, k;

//     for (i = 1; i <= row/2; i++) {
//            for (j = row/2; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (i = (row+1)/2; i >= 1 ; i--) {
//            for (j = row/2; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

        for (i = 1; i <= row / 2; i++) {
            for (j = row / 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = (row + 1) / 2; i >= 1; i--) {
            for (j = row / 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}