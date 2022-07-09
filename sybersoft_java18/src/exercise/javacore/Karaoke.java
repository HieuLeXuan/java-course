package exercise.javacore;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Karaoke {

    public static float TotalMoney(String int_hour, String out_hour, int water_bottle_num) {
        float total_money;
        try {
            int first_hour_money = 30000;
            int first_3hour_money = 30000 * 3;
            float next_first_3hour = (float) (90000 * 30) / 100;
            int water_bottle_money = water_bottle_num * 10000;

            long total_minutes = ChronoUnit.MINUTES.between(LocalTime.parse(int_hour), LocalTime.parse(out_hour));

            if (total_minutes <= 3 * 60) {
                if (total_minutes % 60 == 0) {
                    total_money = ((int) (total_minutes / 60) * first_hour_money) + water_bottle_money;
                } else {
                    total_money = ((int) ((total_minutes / 60) + 1) * first_hour_money) + water_bottle_money;
                }
            } else {
                long anotherMinutes = total_minutes - 3 * 60;
                if (anotherMinutes % 60 == 0) {
                    total_money = (first_3hour_money + (int) (anotherMinutes / 60) * next_first_3hour) + water_bottle_money;
                } else {
                    total_money = (first_3hour_money + (int) ((anotherMinutes / 60) + 1) * next_first_3hour) + water_bottle_money;
                }
            }

            if (LocalTime.parse(int_hour).getHour() >= 9 && LocalTime.parse(out_hour).getHour() <= 17) {
                total_money = total_money - (total_money * 20) / 100;
            }
        } catch (Exception e) {
            return -1;
        }
        return total_money;
    }
}
