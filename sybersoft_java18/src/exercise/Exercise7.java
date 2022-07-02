package exercise;

import java.util.ArrayList;

public class Exercise7 {

    public static ArrayList<Integer> divisor(int natural_num_n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= natural_num_n; i++) {
            if (natural_num_n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
