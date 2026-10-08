package calendarproject;

import java.util.GregorianCalendar;
public class CalendarProject {
    public static void main(String[] args) {

        GregorianCalendar currentCal = new GregorianCalendar();
        int year = currentCal.get(GregorianCalendar.YEAR);
        int month = currentCal.get(GregorianCalendar.MONTH) + 1;
        int day = currentCal.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("Current Date: " + day + "/" + month + "/" + year);
 
        GregorianCalendar specificCal = new GregorianCalendar();
        specificCal.setTimeInMillis(1234567898765L);
        
        year = specificCal.get(GregorianCalendar.YEAR);
        month = specificCal.get(GregorianCalendar.MONTH);
        day = specificCal.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Date for 1234567898765 ms: " + day + "/" + month + "/" +year);
    
    }
    
}
