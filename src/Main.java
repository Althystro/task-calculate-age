import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        Scanner day = new Scanner(System.in);
        Scanner month = new Scanner(System.in);
        Scanner year = new Scanner(System.in);

        System.out.print("please enter day: ");
        int userDay = day.nextInt();

        System.out.print("please enter month: ");
        int userMonth = month.nextInt();

        System.out.print("please enter year: ");
        int userYear = year.nextInt();

//        System.out.println(userDay);
//        System.out.println(userMonth);
//        System.out.println(userYear);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar);
        Calendar DOB = Calendar.getInstance();

        DOB.set(userYear, userMonth - 1, userDay);
        int yearAge = calendar.get(Calendar.YEAR) - DOB.get(Calendar.YEAR);
        int yearMonth = calendar.get(Calendar.MONTH) - DOB.get(Calendar.MONTH);
        int yearDay = calendar.get(Calendar.DAY_OF_YEAR) - DOB.get(Calendar.DAY_OF_YEAR);

        System.out.println("Your age is: " + yearAge + " years old and " + yearMonth + " months old and " + yearDay + " days old");

        day.close();
        month.close();
        year.close();

    }
}