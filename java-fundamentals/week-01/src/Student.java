import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName) {
        // simple normalization so sorting is case-insensitive
        this.firstName = firstName == null ? "" : firstName.trim();
        this.lastName  = lastName  == null ? "" : lastName.trim();
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }

    // Sort by lastName (case-insensitive), then firstName as a tie-breaker
    @Override
    public int compareTo(Student other) {
        int byLast = this.lastName.compareToIgnoreCase(other.lastName);
        if (byLast != 0) return byLast;
        return this.firstName.compareToIgnoreCase(other.firstName);
    }

    // Ensures "distinct students" behave correctly in a Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student s)) return false;
        return firstName.equalsIgnoreCase(s.firstName)
                && lastName.equalsIgnoreCase(s.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
