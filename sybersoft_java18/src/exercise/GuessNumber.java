package exercise;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum, userNum;

        randomNum = getRandomNumber(1, 1000);
        System.out.println("Random: " + randomNum);

        System.out.println("Nhap vao mot so bat ky: ");
        userNum = scanner.nextInt();

        if (randomNum == userNum) {
            System.out.println("Dung voi so bi mat. Xin chuc mung ban!!!");
        } else {
            System.out.println("Nhập một số lớn hơn hoặc nhỏ hơn số bí mật!!!");
        }

    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
