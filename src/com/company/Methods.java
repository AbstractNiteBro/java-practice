                               // METHODS // OVERLOADING //

package com.company;

                               import java.util.Scanner;

                               public class Methods {
    public void tell_joke(){
    System.out.println("i invented a new word plagiarism ! ");
    }
    static void greet(){
        System.out.println("good morning ");
    }
    static void greet(String s){
        System.out.println("Good morning "+ s + " How are you" );
    }
    static double logic(double x, double y) {
        double z;
        if (x > y) {
            z = x + y;
        }
        else if ( x == y){
            z = x - y;
        }
            else {
            z = (x + y) * 2;
        }
        return z;

    }
        public static void main (String[]args){
        new Methods().tell_joke();

        greet();
        System.out.print("enter your name : ");
        Scanner sc2 = new Scanner(System.in);
        String st = sc2.nextLine();
        greet(st);

        System.out.print("enter a value = ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("enter b value = ");
        Scanner sc1 = new Scanner(System.in);
        double b = sc1.nextDouble();
        double c;
        c = logic (a,b);
        System.out.println(c);
        }
    }
