package Array;

public class CntDisntictElement {
    public static void main(String[] args) {

        int arr[] = {10,20,20,10,30};
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] == arr[j] && arr[j]==arr[j+1]) {
                    j++;
                }
                cnt++;
            }
        }
        System.out.println("disntict number of array is " + cnt);
    }
}
