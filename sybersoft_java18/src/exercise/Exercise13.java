package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise13 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, choiceNumber;

        System.out.println("Nhap so phan tu cua mang: ");
        n = scanner.nextInt();

        List<Integer> array = new ArrayList<>();

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
                case 3: {
                    NegativeMinMax(array);
                    break;
                }
                case 4: {
                    PositiveMinMax(array);
                    break;
                }
                case 5: {
                    EvenAndOdd(array);
                    break;
                }
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
        int max = 0, min = 0;
        for (Integer integer : array) {
            if (integer < 0) {
                max = integer;
                min = integer;
                break;
            }
        }
        for (Integer integer : array) {
            if (integer < 0 && integer > max) {
                max = integer;
            }
            if (integer < 0 && integer < max) {
                min = integer;
            }
        }
        System.out.println("Negative Max in Array: " + max);
        System.out.println("Negative Min in Array: " + min);
    }

    public static void PositiveMinMax(List<Integer> array) {
        int max = 0, min = 0;
        for (Integer integer : array) {
            if (integer > 0) {
                max = integer;
                min = integer;
                break;
            }
        }
        for (Integer integer : array) {
            if (integer > 0 && integer > max) {
                max = integer;
            }
            if (integer > 0 && integer < max) {
                min = integer;
            }
        }
        System.out.println("Positive Max in Array: " + max);
        System.out.println("Positive Min in Array: " + min);
    }

    public static void EvenAndOdd(List<Integer> array) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                even.add(integer);
            } else {
                odd.add(integer);
            }
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
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
