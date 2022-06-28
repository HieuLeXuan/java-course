package exercise;

public class Leap {

    public static boolean leapYear(int yearIn) {
        boolean isLeap;

        if (yearIn % 4 == 0) { // chia het cho 4 => nam nhuan
            if (yearIn % 100 == 0) { // chia het cho 100 => khong phai nam nhuan
                // chia het cho 400 => nam nhuan
                // khong chia het cho 400 => khong phai nam nhuan
                isLeap = yearIn % 400 == 0;
            } else { // khong chia het cho 100 => nam nhuan
                isLeap = true;
            }
        } else { // khong chia het cho 4 => khong phai nam nhuan
            isLeap = false;
        }
        return isLeap;
    }
}
