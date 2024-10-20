package Array;

public class TwoDarray {
    public static void main(String[] args) {
        int arr[][]={{2,3,5},{7,8,12}};
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
