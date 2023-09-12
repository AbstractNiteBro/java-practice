package com.company;

public class ArmstrongNum {
//    public static void main(String[] args) {
//        int n = 153;
//        int temp = n;
//        int r, sum =0;

//        while(n > 0 ){
//
//            r = n%10;
//            n = n/10;
//            sum = sum + r*r*r;
//
//        }
//        if(temp == sum)
//            System.out.println("Its an armstrong number");
//        else
//            System.out.println(" Not an armstrong number");
//   }
//}

    public static void main(String[] args) {
       int num = 153;
       int temp = num;
       int r;
       int sum = 0;

      while(num > 0 ){

          r = num % 10;
          num = num / 10;
          sum = r*r*r+sum;
      }
      if (temp == sum)
          System.out.println(temp + " is a Armstrong number");
      else
          System.out.println(temp +" is not an Armstrong number");
    }
}
















