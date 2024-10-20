package arrayList;

import java.util.ArrayList;

public class separateEvenOdd {
    public static void main(String[] args) {
        int x[] = { 10, 22, 31, 41, 50 };
        sepEvenOdd(x);
    }

    public static void sepEvenOdd(int[] a) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even.add(a[i]);
            } else {
                odd.add(a[i]);
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i)+" ");
        }
    }
}
