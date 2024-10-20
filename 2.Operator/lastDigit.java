package Operator;

import java.util.*;
public class lastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int x=sc.nextInt();
        int input=Math.abs(x);
        int res=input%10;
 System.out.println("last digit of a number "+ res);
    }
}
