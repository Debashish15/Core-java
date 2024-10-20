package Array;

public class sumofArray {
    public static void main(String[] args) {
        int arr[]={43,12,45,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("sum is "+ sum);
    }
}
