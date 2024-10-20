package arrlist;

import java.util.ArrayList;
public class traversal {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add("D");

        for(String s:obj){
            System.out.println(s);
        }
    }
}
