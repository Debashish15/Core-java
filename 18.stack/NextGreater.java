public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 3, 5, 8};
        PreviousGreater pg = new PreviousGreater();
        pg.checkingGrt(arr, arr.length);
    }

    void checkingGrt(int arr[], int size) {
        System.out.println(arr[0]);
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.print(arr[i -1 ]+" ");
            }
        }
    }
}
