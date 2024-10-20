package arrlist;

import java.util.ArrayList;

public class smaller {
    public static void main(String[] args) {
        int[] a = { 8, 100, 20, 40, 3, 7 };
        small(a,10);

    }

    public static void small(int[] a,int x) {
        ArrayList<Integer> obj = new ArrayList<>();

       
        for (int i = 0; i < a.length; i++) {
            if (x > a[i]) {
                obj.add(a[i]);
            }
        }
        for (Integer z : obj) {
            System.out.println(z);
        }
    }
}
