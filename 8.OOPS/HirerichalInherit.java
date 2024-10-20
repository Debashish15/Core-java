public class HirerichalInherit {
    public static void main(String[] args) {
engStudent obj1=new engStudent();
// System.out.println(obj1.engStudentDetails());
mgmtStudent obj2=new mgmtStudent();
System.out.println(obj2.mgmtStudentDetails());
    }
}

class Person {
    String name = "Dev";
    String Number = "6370766245";
    String Age = "22";
    String Address = "Odisha";
}

class Student extends Person {
    String college = "LPU";
    String StreamOfStudy = "MCA";
    String Loaction = "Punjab";
    String DegreeCmpltYr = "2025";
}

class faculty extends Person {
    String College = "LPU";
    String Department = "Computer Application";
    String Loaction = "Punjab";
}

class engStudent extends Student {
    String Cabin = "209";
    String Block = "36";
    String Specialization = "Networking";

    String engStudentDetails() {
        return "cabin : " + Cabin + "\n" + "Block : " + Block + "\n" + "Specialization : " + Specialization;
    }
}

class mgmtStudent extends Student {
    String StreamOfTeach = "networking fundamental";
    String Block = "36/38";
    String Specialization = "Cyber";
    String Salary = "100000";

    String mgmtStudentDetails() {
        return "TeachingSubject : " + StreamOfTeach + "\n" + "Block : " + Block + "\n" + "Specialization : "
                + Specialization + "\n" + "Salary" + Salary;
    }

}

class Prof extends faculty {
    String TeachingSubject = "Java";
    String Salary = "70000";
    String Block = "26";

    String ProfDetails() {
        return "TeachingSubject : " + TeachingSubject + "\n" + " salary : " + Salary + "\n " + "Block : " + Block;
    }
}

class Asstprof extends faculty {
    String TeachingSubject = "Reaseach";
    String Salary = "60000";
    String Block = "38";

    String AsstProfDetails() {
        return "TeachingSubject : " + TeachingSubject + "\n" + "Salary : " + Salary + "\n" + "Block : " + Block;
    }
}

class AssociateProf extends faculty {
    String TeachingSubject = "Software Engineering";
    String Salary = "50000";
    String Block = "336";

    String AssociateProfDetails() {
        return "TeachingSubject : " + TeachingSubject + "\n" + "Salary : " + Salary + "\n" + "Block : " + Block;
    }
}