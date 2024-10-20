import java.util.ArrayList;

public class smallerElelment {

    public static void main(String[] args) {
 int arr[]={1,4,2,5};
 int k=2;
 ArrayList<Integer> se=small(arr,k);
 System.out.println(se);
    }

    public static ArrayList<Integer> small(int arr[], int k) {
        ArrayList<Integer> obj = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (k > arr[i]) {
                obj.add(arr[i]);
            }
        }
        return obj;
    }
    }


