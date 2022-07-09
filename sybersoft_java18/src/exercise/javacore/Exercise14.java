package exercise.javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Nhap so phan tu mang: ");
        n = scanner.nextInt();

        List<Integer> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrays.add(i, scanner.nextInt());
        }

        System.out.println("ArrayList: " + arrays);

        for (int i = 0; i < arrays.size(); i++) {
            for (int j = i + 1; j < arrays.size(); j++) {
                if (arrays.get(i).equals(arrays.get(j))) {
                    arrays.remove(j);
                }
            }
        }
        System.out.println("Array after remove: " + arrays);
    }
}
