package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, choiceNumber = 0;

        System.out.println("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();

        List<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            array.add(i, scanner.nextInt());
        }

        System.out.println(array);

        showMenu();
        while (true) {
            choiceNumber = scanner.nextInt();

            switch (choiceNumber) {
                case 1: {
                    AverageValue(array);
                    break;
                }
                case 2: {
                    FindMinMax(array);
                    break;
                }
//			case 5: {
//				EvenAndOdd(array);
//				break;
//			}
                case 6: {
                    AddElement(array, n);
                    break;
                }
                case 7: {
                    RemoveElement(array, n);
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
        System.out.println("1. Average value");
        System.out.println("2. Find max, min value in array");
        System.out.println("3. Find the smallest and largest negative element");
        System.out.println("4. Find the smallest positive largest element");
        System.out.println("5. Print even and odd elements");
        System.out.println("6. Add an element by index");
        System.out.println("7. Remove an element by index");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void AverageValue(List<Integer> array) {
        float average = 0, sum = 0;
        for (Integer integer : array) {
            sum += integer;
        }

        average = (sum / array.size());

        System.out.println("Average Value: " + average);
    }

    public static void FindMinMax(List<Integer> array) {
        float min = array.get(0), max = array.get(0);

        for (Integer integer : array) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
        }

        System.out.println("Gia tri nho nhat: " + min);
        System.out.println("Gia tri lon nhat: " + max);
    }

    public static void NegativeMinMax(List<Integer> array) {
    }

    public static void PositiveMinMax(List<Integer> array) {
    }

    public static void EvenAndOdd(List<Integer> array) {
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                System.out.println("Odd: " + integer);
            } else {
                System.out.println("Even: " + integer);
            }
        }
    }

    public static void AddElement(List<Integer> array, int n) {
        Scanner scanner = new Scanner(System.in);
        int dataAdd, index;

        System.out.println("Nhap phan tu muon them: ");
        dataAdd = scanner.nextInt();

        System.out.println("Nhap index muon them: ");
        index = scanner.nextInt();

        while (index > n || index < 0) {
            System.out.println("Index khong hop le. Moi lap lai: ");
            index = scanner.nextInt();
        }

        if (index < n) {
            array.add(index, dataAdd);
        }

        System.out.println("Array after add: " + array);
    }

    public static void RemoveElement(List<Integer> array, int n) {
        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("Nhap index muon xoa: ");
        index = scanner.nextInt();

        while (index > n || index < 0) {
            System.out.println("Index khong hop le. Moi lap lai: ");
            index = scanner.nextInt();
        }

        if (index < n) {
            array.remove(index);
        }

        System.out.println("Array after remove: " + array);
    }

}
