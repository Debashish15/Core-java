// Queue is inteface in java . so im using LinkedList to implement the Queue
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class intro {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>() ;
        q.offer(10);
     q.offer(20);
     q.offer(30);
     q.offer(40);
     q.offer(50);

     System.out.println(q);
    }
}
