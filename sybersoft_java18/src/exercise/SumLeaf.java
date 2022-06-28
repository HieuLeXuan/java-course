package exercise;

public class SumLeaf {

    public static int sumLeaf(int number) {
        int sum = 0;
        for (int i=1; i<= number; i++) {
            if (isLeaf(i)) {
                sum+=i;
            }
        }
        return sum;
    }

    private static boolean isLeaf(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i<=Math.sqrt(number); i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}
