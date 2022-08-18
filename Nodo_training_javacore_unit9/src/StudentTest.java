import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentTest {
    public static List<Student> filter(List<Student> students, Student.Filter<Student> pred) {
        List list = new ArrayList<>();
        for (Student s :
                students) {
            if (pred.valid(s)) list.add(s);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Tran Van A"));
        students.add(new Student(34, "Nguyen THI B"));
        students.add(new Student(15, "Nguyen Thi C"));
        students.add(new Student(46, "Ta Van C"));


        Student.Filter<Student> older = student -> student.getAge() >= 30;
        List<Student> filtered = filter(students, older);
        filtered.forEach(System.out::println);

    }
}