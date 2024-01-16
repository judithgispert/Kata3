import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        int month = 1;
        System.out.println("Is there Friday 13th in this month? " + dayOfWeek(year, month));
    }
    public static boolean dayOfWeek(int year, int month){
        LocalDate searchDate = LocalDate.of(year, month, 13);
        System.out.println(searchDate);
        DayOfWeek dayWeek = searchDate.getDayOfWeek();
        boolean day13 = false;
        if (dayWeek.getValue() == 5){
            day13 = true;
        }
        return day13;
    }



}