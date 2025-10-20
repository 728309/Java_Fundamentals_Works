//Importing is not needed, but it's good to double add it

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter course name: ");
        String courseName = input.nextLine();
        System.out.println(" ");

        System.out.println("Enter amount of students: ");
        int studentAmount = input.nextInt();
        System.out.println(" ");
        input.nextLine();

        String[] names = new String[studentAmount];
        double[] grades = new double[studentAmount];

        for (int i = 0; i < studentAmount; i++) {
            System.out.println("Enter student " + (i + 1) + "'s name: " );
            names[i] = input.nextLine();
        }
        System.out.println(" ");

        for (int i = 0; i < studentAmount; i++) {
            System.out.println("Enter grade of student #" + (i + 1) + ": " ) ;
            grades[i] = input.nextDouble();
        }
        System.out.println(" ");

        double sum = 0;
        double max = grades[0];
        int maxIndex = 0;

        for (int i = 0; i < studentAmount; i++) {
            sum += grades[i];
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
        }

         sum = sum / studentAmount;

        System.out.printf("%nAverage grade: %.1f%n", sum);
        System.out.printf("Highest grade: %.1f by %s%n%n", max, names[maxIndex]);
        System.out.println(" ");

        System.out.println("All students:");
        for (int i = 0; i < studentAmount; i++) {
            System.out.printf("%-15s %.1f%n", names[i], grades[i]);
        }
    }
}
