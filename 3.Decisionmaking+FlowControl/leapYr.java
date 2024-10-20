package Decisionmaking;
import java.util.*;
public class leapYr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int input=sc.nextInt();

        if (input%400==0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap Year");
        }
    }
}