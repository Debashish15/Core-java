import java.util.*;
public class OpearationHashMap {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>() ;
            s.add(10);
            s.add(20);
            s.add(30);
            s.add(40);
            s.add(50);

            System.out.println(s);
            s.remove(10);
            System.out.println(s);

            System.out.println("Size of HashMap "+ s.size());

            System.out.println("Values Printing ....  ");
            for (int x : s) {
                System.out.print(x + " ");
            }
    }
}
