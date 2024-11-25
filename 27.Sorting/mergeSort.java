import java.util.*;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr1[] = { 10, 15, 20 };
        int arr2[] = { 5, 6, 6, 15 };
        mergeSort obj = new mergeSort();
        obj.merge(arr1, arr2);
    }

    public void merge(int a[], int b[]) {
        int sz1 = a.length;
        int sz2 = b.length;
        int temparr[] = new int[sz1 + sz2];
        for (int i = 0; i < sz1; i++) {
            temparr[i] = a[i];
        }
        for (int j = 0; j < sz2; j++) {
            temparr[sz1+j] = b[j];
        }
        Arrays.sort(temparr);
        for (int x : temparr) {
            System.out.print(x + " ");
        }
    }
}
