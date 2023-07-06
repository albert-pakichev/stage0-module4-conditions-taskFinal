package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int days=0;
        boolean isLeapYear = ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(days);
        } else if (month == 2) {
            days = (isLeapYear) ? 29 : 28;
            System.out.println(days);
        }else if(year<0 || month>12 || month<0) {
            System.out.println("Error");
        }
        else {
            days = 31;
            System.out.println(days);
        }
    }
}
