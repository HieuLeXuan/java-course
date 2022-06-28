package exercise;

import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiseNum;
        boolean flag = false;

        showMenu();
        while (true) {
            choiseNum = scanner.nextInt();
            switch (choiseNum) {
                case 1: {
                    PhuongTrinhBacNhat();
                    break;
                }
                case 2: {
                    PhuongTrinhBacHai();
                    break;
                }
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            showMenu();
        }

    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Giai phuong trinh ba nhat");
        System.out.println("2. Giai phuong trinh bac hai");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void PhuongTrinhBacNhat() {

        Scanner scanner = new Scanner(System.in);
        double a, b, x;

        System.out.println("Nhap thong tin a cua phuong trinh: ");
        a = scanner.nextInt();
        System.out.println("Nhap thong tin b cua phuong trinh: ");
        b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem!!!");
            } else {
                System.out.println("Phuong trinh vo nghiem!!!");
            }
        } else {
            x = -b / a;
            System.out.println("Phuong trinh co nghiem la: " + x);
        }

    }

    public static void PhuongTrinhBacHai() {

        Scanner scanner = new Scanner(System.in);
        double a, b, c, x1, x2;

        System.out.println("Nhap thong tin a cua phuong trinh: ");
        a = scanner.nextInt();
        System.out.println("Nhap thong tin b cua phuong trinh: ");
        b = scanner.nextInt();
        System.out.println("Nhap thong tin c cua phuong trinh: ");
        c = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!!!");
            } else {
                x1 = -c / a;
                System.out.println("Phuong trinh co mot nghiem: " + x1);
            }
            return;
        }

        double delta;
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!!!");
        } else if (delta == 0) {
            x1 = -b / 2 * a;
            System.out.println("Phuong trinh co nghiem kep: " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiem x1: " + x1);
            System.out.println("Nghiem x2: " + x2);
        }

    }
}
