
package Abstract;

import java.util.*;



public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current Time is " + new Date());
        System.out.println("Year " + calendar.get(Calendar.YEAR));
        System.out.println("Month " + calendar.get(Calendar.MONTH));
        System.out.println("Date " + calendar.get(Calendar.DATE));
        System.out.println("Hour " + calendar.get(Calendar.HOUR));
        System.out.println("Hour_Of_Day " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute " + calendar.get(Calendar.MINUTE));
        System.out.println("Seconds " + calendar.get(Calendar.SECOND));
        System.out.println("Day_Of_Week " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day_Of_Month " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day_Of_Year " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Week_Of_Month " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Week_Of_Year " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Hour " + calendar.get(Calendar.HOUR));
       
        
    }
}
