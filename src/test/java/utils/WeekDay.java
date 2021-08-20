package utils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

public class WeekDay {
    private String privateDay;

    public WeekDay(){
        Calendar calendar = Calendar.getInstance();
        String day = LocalDate.ofInstant(calendar.toInstant(), ZoneId.systemDefault()).getDayOfWeek().toString();
        privateDay = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();
    }

    public String getDay() {
        return privateDay;
    }
}
