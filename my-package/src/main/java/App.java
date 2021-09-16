import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class App {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020, 10,10);
        LocalDate localDate1 = LocalDate.of(2020, 10,20);

        System.out.println(localDate.until(localDate1, DAYS));

        System.out.println(DAYS.between(localDate, localDate1));

        double a = 55;
        System.out.println(a/3);

        }
}
