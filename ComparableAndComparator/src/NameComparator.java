import java.util.Comparator;

public class NameComparator implements Comparator<StudentForComparator> {
    @Override
    public int compare(StudentForComparator o1, StudentForComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
