package exercise.javacore;

import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Nhap vao so tu nhien n: ");
        n = scanner.nextInt();

        while (n < 1 || n > 9) {
            System.out.println("So tu nhien n phai lon hon 1 va nho hon 9. Moi ban nhap lai: ");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.printf("\n");
        }

    }
}
