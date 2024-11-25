import java.util.HashSet;

public class PrintReapiting {
    public static void main(String[] args) {
        PrintReapiting obj = new PrintReapiting();
        int arr[] = {10, 8, 10, 7, 7, 6};
        obj.RP(arr);
    }

    public void RP(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.print(arr[i] + " ");
            } else {
                set.add(arr[i]);
            }
        }
    }
}
