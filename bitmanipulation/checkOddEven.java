package bitmanipulation;

public class checkOddEven {

    public static void checkOddEvenNumber(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd NUmber");
        } else {
            System.out.println("Even NUmber");
        }
    }

    public static void main(String args[]) {
        checkOddEvenNumber(11);
    }
}