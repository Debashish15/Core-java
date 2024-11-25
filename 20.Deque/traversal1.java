import java.util.*;
public class traversal1 {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        // traverse using Iterator
        Iterator it=d.iterator(); 
            while(it.hasNext()){
                System.out.print(it.next()+ "  ");
            }
    
    }
}
