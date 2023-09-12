package com.company;

class employee{

    int id;
    int getSalary;
    String name;
    public void print_detail(){
        System.out.println("\t this your id = "+id);
        System.out.println("\t this is your name = "+name);
    }
public int getSalary(){
        return getSalary;
}
}
public class Oops_class {
    public static void main(String[] args) {
        System.out.println("// Your employees details are down below //");
        System.out.println();

        employee E1 = new employee();
        employee E2 = new employee();

        E1.id = 202;
        E1.name = "Suresh";
        E1.getSalary = 15000;


        E2.id = 203;
        E2.name = "Harry";
        E2.getSalary = 35000;

        E1.print_detail();
        System.out.println("\t your salary is = "+E1.getSalary);
        System.out.println();
        E2.print_detail();
        System.out.println("\t your salary is = "+E2.getSalary);


        //printing the attribute
//        System.out.println("your id is = "+E1.id);
//        System.out.println("Employee name is = "+E1.name);
    }
}
