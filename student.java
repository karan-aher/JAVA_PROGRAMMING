// Code for single inheritance in java 
import java.util.*;

class student {
    int rollno;
    String name;

    void get_stud_info() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no:");
        rollno = sc.nextInt();
        System.out.println("Enter student name:");
        name = sc.next();
    }

    void disp_stud_info() {
        System.out.println("Student roll no: " + rollno);
        System.out.println("Student name: " + name);
    }
}

class test extends student {
    int marks1, marks2;

    void get_stud_marks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student test-1 marks:");
        marks1 = sc.nextInt();
        System.out.println("Enter student test-2 marks:");
        marks2 = sc.nextInt();
    }

    void disp_stud_marks() {
        System.out.println("Test-1 marks: " + marks1);
        System.out.println("Test-2 marks: " + marks2);
    }
}

class singleInheritance {
    public static void main(String args[]) {
        test t1 = new test();
        t1.get_stud_info();
        t1.get_stud_marks();
        t1.disp_stud_info();
        t1.disp_stud_marks();
    }
}
