import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a year:");
        int year = input.nextInt();
        System.out.println("Write a month:");
        int month = input.nextInt();
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