package exercise.javacore;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi bat ky: ");
        java.lang.String str = scanner.nextLine();

        System.out.println("Do dai cua chuoi: " + str.length());

        System.out.println("Nhap vao mot vi tri nhat dinh: ");
        int index = scanner.nextInt();

        System.out.println("Chuoi con: " + str.charAt(index));

        if (str.contains("abcdef")) {
            System.out.println("Chuoi 'abcdef' co trong chuoi!");
        } else {
            System.out.println("Chuoi 'abcdef' khong co trong chuoi!");
        }
    }
}
