public class cnstrct {
    public static void main(String[] args) {
        ABC obj = new ABC(110, 220);
        System.out.println(obj.print());
    }
}

class ABC {
    public int a, b;

    ABC(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int print() {
        return a + b;
    }
}
