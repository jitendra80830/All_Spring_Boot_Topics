package String;

/*The student is eligible for an attendance award if they meet both of the following criteria:

        The student was absent ('A') for strictly fewer than 2 days total.
        The student was never late ('L') for 3 or more consecutive days.*/
public class StudentAttendanceRecord {
    public static void main(String[] args) {
        String str = "PPALLAP";
        boolean attendanceRecord = studentAttendanceRecord(str);
        System.out.println(attendanceRecord);
    }

    private static boolean studentAttendanceRecord(String str) {
        int absent = 0;
        int late = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A'){
                absent++;
                if(absent>=2){
                    return false;
                }
            }
            if(str.charAt(i) == 'L'){
                late++;
                if(late>=3){
                    return false;
                }
            }else {
                late = 0;
            }
        }
        return true;
    }
}
