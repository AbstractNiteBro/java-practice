package com.company;

import java.util.Scanner;

//class MyEmployee{
//    private int id;
//    private String name;
//
//    public void setId(int id) {
//        this.id = id;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
//}
//public class AccessModifiers_Constructors {
//    public static void main(String[] args) {
//        MyEmployee nitesh = new MyEmployee();
//        System.out.println("Enter your name");
//        nitesh.setName("my name is nitesh");
//        nitesh.setId(347527);
//
//        System.out.println(nitesh.getName());
//        System.out.println(nitesh.getId());
//
//
//    }
//
//}

         // USER INPUT PRIVATE MODIFIERS

class MyEmployee{
    private long id;
    private String name;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class AccessModifiers_Constructors {
    public static void main(String[] args) {
        MyEmployee nitesh = new MyEmployee();
        System.out.print("Please enter your Name here : ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        nitesh.setName(Name);
        System.out.print("Please enter your ID here : ");
        Scanner sc1 = new Scanner(System.in);
        long Id = sc1.nextLong();
        nitesh.setId(Id);

        System.out.println(nitesh.getName());
        System.out.println(nitesh.getId());


    }

}