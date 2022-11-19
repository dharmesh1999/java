package opps;

public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student(123); // call rollNum counstriuction
        Student s2 = new Student("Dharmesh"); // call name valu construction
        System.out.println(s1.name);

        s1.name = "Dharmesh";
        s1.roll = 123;
    }
}

class Student {
    String name;
    int roll;

    // Parameterized construction
    Student(String name) {
        // System.out.println(x);
        this.name = name;
    }
    // Non-parameterrized construction
    // Student() {
    // System.out.println("Counstuction called");
    // }

    Student(int rollNum) {
        this.roll = rollNum;
    }
}
