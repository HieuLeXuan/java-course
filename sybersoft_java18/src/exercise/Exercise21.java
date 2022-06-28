package exercise;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        double x1, v1, x2, v2;

        System.out.println("Nhap vi tri kangaroo 1: ");
        x1 = scanner.nextDouble();

        while (x1 < 0 && x1 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            x1 = scanner.nextDouble();
        }

        System.out.println("Nhap van toc kangaroo 1: ");
        v1 = scanner.nextDouble();

        while (v1 < 1) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            v1 = scanner.nextDouble();
        }

        System.out.println("Nhap vi tri kangaroo 2: ");
        x2 = scanner.nextDouble();

        while (x2 < x1 && x2 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            x2 = scanner.nextDouble();
        }

        System.out.println("Nhap van toc kangaroo 2: ");
        v2 = scanner.nextDouble();

        while (v2 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            v2 = scanner.nextDouble();
        }

        while (x1 != x2) {
            x1 += v1;
            x2 += v2;
        }

        if (x1 == x2) {
            System.out.println("Hai con kangaroo gap nhau!!!");
            System.out.println("Vi tri hai con kangeroo gap nhau: " + x1);
        } else {
            System.out.println("Hai con kangaroo khong gap nhau!!!");
        }

    }
}
