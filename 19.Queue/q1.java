import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class q1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("queue elements : " + q);
        System.out.println("Peek element is : "+q.peek());
        System.out.println("Size of the Queue is : "+q.size());
        System.out.println("check Queue is empty or not : "+q.isEmpty());
    }
}
