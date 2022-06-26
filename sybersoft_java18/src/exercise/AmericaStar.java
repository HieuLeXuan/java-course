package exercise;

public class AmericaStar {

    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 50; j++) {
                System.out.print("=");
                if (i == 1 || i == 2 || i == 3) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
