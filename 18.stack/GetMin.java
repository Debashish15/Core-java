import java.util.ArrayDeque;
import java.util.Collections;
public class GetMin {
    public static void main(String[] args) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        s.push(20);
        s.push(10);

        int min=Collections.min(s);
        System.out.println(min);
    }

   
}
