// import java.util.Queue;
// import java.util.ArrayDeque;
// import java.util.LinkedList;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        q.offerFirst(10);
        q.offerLast(20);
        q.offerFirst(5);
        q.offerLast(15);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());
    }
}
