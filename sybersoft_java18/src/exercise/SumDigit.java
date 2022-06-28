package exercise;

public class SumDigit {

    public static float sumDigit(int natural_num_n) {
        int count = 0;

        if (natural_num_n < 0) {
            return -1;
        }

        while (natural_num_n > 0) {
            natural_num_n /= 10;
            count++;
        }

        return count;
    }
}
