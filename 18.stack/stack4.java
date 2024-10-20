import java.util.ArrayDeque;
import java.util.Scanner;

public class stack4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("item " + i);
           int x=sc.nextInt();
            s.push(x);
        }

        for (Integer z : s) {
            System.out.print(z+" ");
        }
    }
}
