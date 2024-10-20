public class MultilevelInherit {
    public static void main(String[] args) {
        C obj = new C();
        obj.name = "Dev";
        obj.address = "Odisha";
        obj.Number = "6370766245";
        obj.Age = "22";
        obj.Branch = "Computer Application";
        obj.Stream = "MCA";
        obj.CollegeLocation = "Punjab";
        obj.Specialization = "Java Developer";

        System.out.println(obj.PersonalDetails());
        System.out.println(obj.EducationDetails());

    }
}

class A {
    String name;
    String address;
    String Number;
    String Age;
}

class B extends A {
    String Branch;
    String Stream;
    String CollegeLocation;
    String Specialization;

}

class C extends B {

    String PersonalDetails() {
        return "name : " + this.name + " \n" + "Address : " + this.address + " \n" + "Number : " + this.Number + " \n"
                + "Age : " + this.Age;
    }

    String EducationDetails() {
        return "Branch : " + this.Branch + " \n" + "Stream : " + this.Stream + "\n" + "Clglocation : "
                + this.CollegeLocation + " \n" + "Specialization : " + this.Specialization;
    }

}