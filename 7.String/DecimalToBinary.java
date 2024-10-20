public class DecimalToBinary {
    public static void main(String[] args) {
        DB(10);
    }
    public static void DB(int num){
       String s=" ";
       while (num>0) {
        s=(num%2)+s;
        num=num/2;
       }
       System.out.println(s);
    }
}
