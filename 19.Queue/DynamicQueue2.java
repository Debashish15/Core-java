import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DynamicQueue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();

        // System.out.println("Total element you want to insert ");
        // int x = sc.nextInt();
        // for (int i = 0; i < x; i++) {
        //     System.out.println("element" + i);
        //     int input = sc.nextInt();
        //     q.offer(input);
        // }

        while (true) {
        System.out.println("1 : queue element");
        System.out.println("2 : peek element");
        System.out.println("3 : add element");
        System.out.println("4 : remove element");
        System.out.println("5 : is empty");
        System.out.println("6 : size of queue");
        System.out.println("7 : Exit");
       
        System.out.println("choose one");
        int z=sc.nextInt();
        switch (z) {
            case 1:
                System.out.println(q);
                break;
            
            case 2:
            System.out.println(q.peek());
            break;

            case 3:
            System.out.print("add element" + " ");
            int input = sc.nextInt();
            System.out.println(q.offer(input));
            break;

            case 4:
           System.out.println(q.poll());
            break;

            case 5:
         System.out.println(q.isEmpty());
            break;

            case 6:
            System.out.println(q.size());
            break;

           case 7:
           System.out.println("Exiting....");
           sc.close();
           break;

            default:
            System.out.println("invalid input");
                break;
        }
    }

    }
}
