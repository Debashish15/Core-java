package Decisionmaking;

import java.util.*;

import Operator.sumOfNatural;
public class Decisionmaking{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int input=sc.nextInt();

 int x=input%2;
int z=input/2;
        if(x==0){
            if (z > 0) {
                System.out.println("Positive even");
            }
            else{
                System.out.println("Negative even");
            }
        }
        else if (x!=0) {
            if (z >0) {
                System.out.println("Positive Odd");
            }
            else{
                System.out.println("Negative Odd");
            }
        }
    }
}