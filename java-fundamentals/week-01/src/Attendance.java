import java.util.Arrays;
import  java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students? ");
        int total = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[total];

        for (int i = 0; i < total; i++) {
            System.out.print("Enter name of student #" + (i+1) + ": ");
            students[i] = new Student(sc.nextLine());
        }

        for (Student s : students) {
            System.out.print("Is " + s.getName() + " present? (Y/N): ");
            s.setPresent(sc.nextLine().trim().equalsIgnoreCase("Y"));
        }

        System.out.println("\nAttendance:");
        for (Student s : students) {
            System.out.printf("%-15s %s%n", s.getName(),
                    s.isPresent() ? "Present" : "Absent");
        }
    }
}