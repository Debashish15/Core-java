import java.util.*;
public class operation{
public static void main(String[] args) {
    Set<Integer> s=new HashSet<>();
    s.add(10);
    s.add(20);
    s.add(30);

    // union
    // System.out.println(s.addAll(s));
    
    // check the value is in the table or not 
    System.out.println(s.contains(30));
}
}