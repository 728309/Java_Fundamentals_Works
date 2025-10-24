import java.util.Set;
import java.util.TreeSet;

public class SortedStudentsApp {
    public static void main(String[] args) {
        // TreeSet = automatically sorted using Student.compareTo(...)
        Set<Student> students = new TreeSet<>();

        students.add(new Student("Ana",   "Perez"));
        students.add(new Student("Bilal", "Ahmed"));
        students.add(new Student("Chloe", "Nguyen"));
        students.add(new Student("Dino",  "Smith"));
        students.add(new Student("Eva",   "Brown"));

        // Prove it’s sorted (by last name, then first name)
        System.out.println("Sorted students:");
        for (Student s : students) {
            System.out.println(" - " + s);
        }

        // Optional: show that duplicates (same first+last) are ignored by the Set
        students.add(new Student("eva", "brown")); // same as Eva Brown (case-insensitive)
        System.out.println("\nCount after adding duplicate: " + students.size());
    }
}
