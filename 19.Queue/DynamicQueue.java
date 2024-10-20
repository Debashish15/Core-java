import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DynamicQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println("Total element you want to insert ");
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("element" + i);
            int input = sc.nextInt();
            q.offer(input);
        }
        System.out.println(q);


    }
}
