package Operator;

import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 System.out.println("enter the number");
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }

        System.out.println("sum of the number is " + sum);
    }
}
