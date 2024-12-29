import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTimeAPI {
    public static void main(String[] args) {

        //LocalDate
        System.out.println("LocalDate");
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate custom = LocalDate.of(2024, 9, 12);
        System.out.println(custom);
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonth());
        System.out.println(now.getYear());
        System.out.println(now.minusDays(1));
        if(now.isAfter(now.minusDays(1))){
            System.out.println("yes");
        }
        System.out.println("==========LocalTime====");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(LocalTime.of(14,20,20));
    }
}
