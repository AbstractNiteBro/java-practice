package com.company;
 import java.util.*;
public class String1 {
//static void kills(String h ){
//    System.out.println("kill "+ h);
//}
    public static void main(String[] args) {
//        kills("him");
        StringBuilder sb = new StringBuilder("Hello Buddy");
        System.out.println(sb.charAt(1));
        sb.setCharAt(0,'R');
        System.out.println(sb);
        System.out.println(sb.append("o"));
        System.out.println(sb.insert(2,"io"));

        String name = "Tony";
        String S1 = "my name is anthony";
        System.out.println(S1);
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.contains("o"));
        System.out.println(name.trim());
        System.out.println(name.endsWith("y"));
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));
    }

    }

