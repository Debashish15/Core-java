public class SingleInherit {
    public static void main(String[] args) {
        B obj = new B();
        obj.student = "Devasish";
        obj.RollNo = "12308450";
        obj.Stream = "MCA";

        System.out.println(obj.GetData());
    }
}

class A {
    String student;
    String RollNo;
    String Stream;
}

class B extends A {

    String GetData() {
        return this.student+" "+ this.RollNo+" "+ this.Stream;

    }
}