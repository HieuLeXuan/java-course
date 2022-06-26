package exercise;

import java.util.Scanner;

public class Karaoke {

    static Scanner scanner = new Scanner(System.in);

    public static float TotalMoney(int water_bottle) {
        float total_money = 0.0f;

        float first_hour_money = 30000;
        float first_3hour_money = 30000 * 3;
        float next_first_3hour = (float) (90000 * 30) / 100;
        float water_bottle_money = water_bottle * 10000;

        System.out.println("Enter start hour: ");
        float in_hour = scanner.nextFloat();

        while (in_hour < 0) {
            System.out.println("In Hour must to more than 0. Enter against: ");
            in_hour = scanner.nextFloat();
        }

        System.out.println("Enter out hour: ");
        float out_hour = scanner.nextFloat();

        while (out_hour < 0 || out_hour < in_hour) {
            System.out.println("Out Hour must to more than 0. Enter against: ");
            out_hour = scanner.nextFloat();
        }

        float total_hour = out_hour - in_hour;

        if (total_hour <= 3) {
            total_money = (total_hour * first_hour_money) + water_bottle_money;
        } else if (total_hour > 3) {
            total_money = (first_3hour_money + (total_hour - 3) * next_first_3hour) + water_bottle_money;
        }

        if (in_hour >= 9 && out_hour <= 17) {
            total_money = (total_money * 20) / 100;
        }

        return total_money;
    }
}
