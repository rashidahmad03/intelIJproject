import java.util.Calendar;
import java.util.Scanner;

public class Solution
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    private static String getDay(String day, String month, String year) {

        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        int dayOfWeek =
        String s="";
        switch(dayOfWeek) {
            case 1:
                s="Monday";
                break;
            case 2:
                s="Tuesday";
                break;

            case 3:
                s="Wednesday";
                break;
            case 4:
                s="Thursday";
                break;
            case 5:
              s= "Friday";
              break;
            case 6:
               s="Saturday";
                break;
            case 7:
               s="Sunday";
                break;
        }
        return s;
    }
}