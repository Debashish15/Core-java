import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        DistinctElement obj = new DistinctElement();
        int arr[] = { 4, 8, 5, 8, 7, 5 };
        obj.DE(arr);
    }

    public void DE(int arr[]) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                System.out.print(arr[i]+" ");
                set.add(arr[i]);
            }
        }
    }
}
