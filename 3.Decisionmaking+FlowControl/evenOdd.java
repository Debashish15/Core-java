package Decisionmaking ;
import java.util.*;
public class evenOdd {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int input=sc.nextInt();

        if (input%2==0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
