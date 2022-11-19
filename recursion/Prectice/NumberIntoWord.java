package recursion.Prectice;

public class NumberIntoWord {

    public static void printNumberIntoWord(int number) {
        String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // base
        if (number == 0) {
            return;
        }

        // kaam
        int lastDigit = number % 10;
        printNumberIntoWord(number / 10);
        System.out.print(digit[lastDigit] + " ");
    }

    public static void main(String args[]) {
        printNumberIntoWord(1234);
    }
}
