import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseKItem {
    public static void main(String[] args) {
        int k=3;
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);



     Deque<Integer> stack=new ArrayDeque<>();
     for(int i=0;i<k;i++){
        stack.push(q.poll());
     }

     for (int i = 0; i < k; i++) {
        q.offer(stack.pop());
     }

     for (int i = 0; i < q.size()-k; i++) {
        q.offer(q.poll());
     }
        System.out.println(q);
    }
}
