package exercise;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double viTri1, vanToc1, viTri2, vanToc2;

        System.out.println("Nhap vi tri kangaroo 1: ");
        viTri1 = scanner.nextDouble();

        while (viTri1 < 0 && viTri1 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            viTri1 = scanner.nextDouble();
        }

        System.out.println("Nhap van toc kangaroo 1: ");
        vanToc1 = scanner.nextDouble();

        while (vanToc1 < 1) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            vanToc1 = scanner.nextDouble();
        }

        System.out.println("Nhap vi tri kangaroo 2: ");
        viTri2 = scanner.nextDouble();

        while (viTri2 < viTri1 && viTri2 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            viTri2 = scanner.nextDouble();
        }

        System.out.println("Nhap van toc kangaroo 2: ");
        vanToc2 = scanner.nextDouble();

        while (vanToc2 > 10000) {
            System.out.println("Gia tri khong chinh xac. Moi ban nhap lai: ");
            vanToc2 = scanner.nextDouble();
        }

        while (viTri1 != viTri2) {
            viTri1 += vanToc1;
            viTri2 += vanToc2;
        }

        if (viTri1 == viTri2) {
            System.out.println("Hai con kangaroo gap nhau!!!");
            System.out.println("Vi tri hai con kangeroo gap nhau: " + viTri1);
        } else {
            System.out.println("Hai con kangaroo khong gap nhau!!!");
        }

    }
}
