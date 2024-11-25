import java.util.HashSet;

public class OpearationHashMap3 {
public static void main(String[] args) {
    HashSet<Integer> s=new HashSet<>();
  s.add(10); // Add the data into the HashSet
  s.remove(10); // remove the specific elememt from the Hashset
  s.removeAll(s); // remove all the element from the Hashset
  s.clear();
  s.size(s); // Total Size of the HashSet
  s.contains(10); // Check the value is present or not in the HashSet
  s.isEmpty(); // Check the HashSet is empty or Not
 


//   Time complecity of add,remove,contain is o(1)- Avarage case
//  size , isempty is o(1)
}    
}

