package Array;

public class maximumArray {
    public static void main(String[] args) {
        int arr[]={5,8,9,2};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max=arr[i];
            }
        }
        System.out.println("max value is "+max);
    }
}
