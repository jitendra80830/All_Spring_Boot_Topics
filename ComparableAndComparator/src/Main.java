import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("jitendra","22222",101));
        students.add(new Student("mansh","09002",109));
        students.add(new Student("kamal","24321",104));
        students.add(new Student("aman","98787",107));
        //System.out.println(students);
        Collections.sort(students);

        ArrayList<StudentForComparator> studentForComparator = new ArrayList<>();
        studentForComparator.add(new StudentForComparator("jitendra","22222",101));
        studentForComparator.add(new StudentForComparator("mansh","09002",109));
        studentForComparator.add(new StudentForComparator("kamal","24321",104));
        studentForComparator.add(new StudentForComparator("aman","98787",107));
        //System.out.println(students);
        Collections.sort(studentForComparator , new IdComparator());
        System.out.println(studentForComparator);
        ArrayList<StudentForComparator> studentForComparators = new ArrayList<>(studentForComparator);
        Collections.sort(studentForComparators , new NameComparator());
        System.out.println(studentForComparators);

    }
}