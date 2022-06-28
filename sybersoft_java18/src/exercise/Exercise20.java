package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Nhap so phan tu mang: ");
        n = scanner.nextInt();

        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arrOdd = new ArrayList<Integer>();
        List<Integer> arrEven = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            arr.add(i, scanner.nextInt());
        }

        System.out.println("Mang sau khi them: " + arr);

        for (Integer integer : arr) {
            if (integer % 2 == 0) {
                arrOdd.add(integer);
            } else {
                arrEven.add(integer);
            }
        }

        System.out.println("Mang chan: " + arrOdd);
        System.out.println("Mang le: " + arrEven);

    }
}
