package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println("    // WORD COUNT PROGRAMME // ");
        System.out.print("Type Here = ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();                   // User Input
        String str1 = str.replaceAll(" ", "");   // for remove single Space
        String str2 = str1.toUpperCase();            //  for converting all the charters into Upper Case
        char[] ch1 = str2.toCharArray();            // for converting into an Array

        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : ch1) {
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            }
            else {
                count.put(ch, 1);
            }
        }
        System.out.println(count);


//    public static void main(String[] args) {
//        System.out.print("Enter any String = ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char [] ch1 = str.toCharArray();

//        HashMap<Character,Integer> count = new HashMap<>();
//        for(char ch:ch1){
//           if(count.containsKey(ch)){
//               count.put(ch,count.get(ch)+1);
//           }
//           else{
//               count.put(ch,1);
//           }
//
//       }
//
//        System.out.println(count);


    }
}
