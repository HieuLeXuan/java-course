package exercise;

public class Exercise1 {

    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        for (int k = 1; k <= 4; k++) {
            for (int i = 1; i <= 7; i++) {
                if (k % 2 == 1) {
                    if (i % 2 == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (i % 2 == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.print(" ");
            for (int i = 1; i <= 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 1; k <= 6; k++) {
            for (int i = 1; i <= 28; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
