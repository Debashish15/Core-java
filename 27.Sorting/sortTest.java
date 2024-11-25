import java.util.Scanner;
import java.util.Arrays;

public class sortTest {
    public static void main(String[] args) {
        // System.out.println("hello Dev");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the counter");
        int input = sc.nextInt();
        int arr[] = new int[input];

        for (int i = 0; i < input; i++) {

            System.out.print("input " + i + " " + " value is " + " ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}