package exercise;

public class Exercise9 {

    public static boolean compareTwoNum(int num, int anotherNum) {
        int firstNum = num % 10;
        int remainingNum = (num / 10) % 10;
        int firstAnotherNum = anotherNum % 10;
        int remainingAnotherNum = (anotherNum / 10) % 10;
        if (num < 10 || anotherNum < 10 || num > 99 || anotherNum > 99) {
            return false;
        }
        return (firstNum == firstAnotherNum) || (firstNum == remainingAnotherNum) || (remainingNum == firstAnotherNum) || (remainingNum == remainingAnotherNum);
    }
}
