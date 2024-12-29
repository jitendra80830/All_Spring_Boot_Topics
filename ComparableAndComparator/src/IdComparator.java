import java.util.Comparator;

public class IdComparator implements Comparator<StudentForComparator> {
    @Override
    public int compare(StudentForComparator o1, StudentForComparator o2) {
        return o1.getsId() - o2.getsId();
    }
}
