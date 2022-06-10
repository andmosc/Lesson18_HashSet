import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String idStudent;

    public Student(String name, String group, String idStudent) {
        this.name = name;
        this.group = group;
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return name+", "+group+", "+idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(idStudent, student.idStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStudent);
    }
}
