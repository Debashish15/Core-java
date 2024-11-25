import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l=new LinkedHashSet<>();
        l.add(10);
        l.add(20);
        l.add(30);

        l.remove(10);

        l.add(10);
        System.out.println(l);
    }
    
}
