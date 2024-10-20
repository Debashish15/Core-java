package Operator;

import java.util.*;

public class DaysBeforeNdays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("inout 1");
        int n = sc.nextInt();
        System.out.println("inout 2");
        int d = sc.nextInt();

        int x = d % 7;
        int z = n - x;

        for (int i = 0; i < z; i++) {
            switch (i) {
                case 1:
                    System.out.println("Sunday");
                    break;

                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    break;
            }
        }
    }
}