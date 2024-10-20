import java.util.*;

public class GCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1");
        int a = sc.nextInt();
        System.out.println("input 2");
        int b = sc.nextInt();

        int smaller = Math.min(a, b);

        int res = 0;
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        System.out.println("GCD is "+ res);
    }
}
