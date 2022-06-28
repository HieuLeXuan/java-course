package exercise;

public class RadixConversion {

    public static final char CHAR_55 = 55;

    public static String convertNumber(int natural_num_n, int base_b) {
        if (natural_num_n < 0 || base_b < 2 || base_b > 16) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = natural_num_n;

        while (remainder > 0) {
            if (base_b > 10) {
                m = remainder % base_b;
                if (m >= 10) {
                    sb.append((char) (CHAR_55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % base_b);
            }
            remainder = remainder / base_b;
        }
        return sb.reverse().toString();
    }
}
