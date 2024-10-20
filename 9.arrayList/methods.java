package arrayList;

import java.util.ArrayList;

public class methods {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();

        obj.add(10);
        obj.add(20);
        obj.add(30);

        System.out.println(obj);
        obj.add(3, 40);
        System.out.println(obj);
        obj.contains(30);
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);


        System.out.println(obj.get(2));

        obj.set(2, 50);
        System.out.println(obj);

        System.out.println(obj.indexOf(20));


    }
}
