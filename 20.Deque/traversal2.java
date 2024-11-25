import java.util.*;
public class traversal2 {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);
        for (Integer x : d) {
            System.out.print(x + " ");
        }
    }
}
