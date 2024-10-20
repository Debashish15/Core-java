import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
public class reverselist {

    public static void main(String[] args) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(11);
        s.push(12);
        s.push(44);
        
        System.out.print("Stack elements");
        System.out.println(s);
        
        System.out.print("reversed list ");
        System.out.println(s.reversed());
    }
}