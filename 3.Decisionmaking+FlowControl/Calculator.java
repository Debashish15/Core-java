package Decisionmaking;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("input 1");
        int a=sc.nextInt();
        System.out.println("input 2");
        int b=sc.nextInt();

        System.out.println(" 1 is Addition");
        System.out.println(" 2 is Subtraction");
        System.out.println(" 3 is multipication");
        int res=sc.nextInt();

        switch (res) {
            case 1:
                System.out.println(a+b);
                break;
        
                case 2:
                System.out.println(a-b);
                break;

                case 3:
                System.out.println(a*b);
                break;

            default:
            System.out.println("invalid input");
                break;
        }
    }
}
