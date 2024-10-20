package Array;

public class Average {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum of array is " + sum);
        int res = sum / size;
        System.out.println("avrge of array is " + res);
    }
}
