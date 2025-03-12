
import java.util.Scanner;

class Student {

    String name;
    String enrollmentNumber;
    int[] scores = new int[3];
    String[] subjects = new String[3];
    int total;

    Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student's name: ");
        name = scanner.nextLine();

        System.out.print("Enter enrollment number: ");
        enrollmentNumber = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Subject name: ");
            subjects[i] = scanner.nextLine();
            System.out.print("Score for subject " + subjects[i] + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine();
        }

        total = (scores[0] + scores[1] + scores[2]);
        if (total < 25) {
            total = 0;
        }
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Scores:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + subjects[i] + ": " + scores[i]);
        }
        System.out.println("Total: " + total);
    }
}

class FirstYear {

    int NStudents;
    Student[] students;
    String staff, course;

    FirstYear(String stf, String c, int N) {
        staff = stf;
        course = c;
        NStudents = N;
        students = new Student[NStudents];

        for (int i = 0; i < NStudents; i++) {
            students[i] = new Student();
        }
    }

    void bestStudent() {
        int max = 0;
        int idx = -1;

        for (int i = 0; i < NStudents; i++) {
            if (students[i].total > max) {
                max = students[i].total;
                idx = i;
            }
        }

        if (idx != -1) {
            students[idx].displayDetails();
        } else {
            System.out.println("No students found.");
        }
    }
}

public class StudentsMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the staff name: ");
        String staff = scanner.nextLine();

        System.out.print("Enter the course name: ");
        String course = scanner.nextLine();

        FirstYear firstYear = new FirstYear(staff, course, numStudents);

        firstYear.bestStudent();
    }
}
