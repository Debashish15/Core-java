import java.util.*;
public class Arraydequeu {
    public static void main(String[] args) {
        Deque<Integer> ad=new ArrayDeque<>();
        ad.push(10);
        ad.push(20);
        System.out.println(ad);
        System.out.println(ad.pop());
    }
}
