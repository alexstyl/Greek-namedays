package your.package;

import java.util.Calendar;

public class OrthodoxEasterCalculator {

    /**
     * Calculates the date of the Easter Sunday for the given year
     */
    public Calendar calculateEasterForYear(int year) {
        int a = year % 4;
        int b = year % 7;
        int c = year % 19;
        int d = (19 * c + 15) % 30;
        int e = (2 * a + 4 * b - d + 34) % 7;
        int month = (int) Math.floor((d + e + 114) / 31);
        int day = ((d + e + 144) % 31) + 1;
        day++;

        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.YEAR, year);
        instance.set(Calendar.MONTH, month);
        instance.set(Calendar.DAY_OF_MONTH, day);

        instance.add(Calendar.DAY_OF_MONTH, 13);

        return instance;
    }
}
