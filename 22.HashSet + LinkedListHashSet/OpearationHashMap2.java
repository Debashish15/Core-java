import java.util.HashSet;
import java.util.Scanner;

public class OpearationHashMap2 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Storage Input :");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Data adding " + i + " ");
            int value = sc.nextInt();
            s.add(value);
        }
        System.out.println("Values Are :  " + s);
    }
}
