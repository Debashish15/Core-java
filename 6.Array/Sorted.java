package Array;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("input" + i + " ");
            arr[i] = sc.nextInt();
        }
        if (sort(arr, size)) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    public static boolean sort(int arr[], int size) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
