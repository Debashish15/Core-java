import java.util.*;
import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        int a[] = { 2, 1, 44, 13, 595, 173, 1, 60 };
        intro obj = new intro();
        obj.Sorting(a);
    }

    public void Sorting(int arr[]) {
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
