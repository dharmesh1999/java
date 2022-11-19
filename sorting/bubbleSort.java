package sorting;

public class bubbleSort {
    public static void sorting(int number[]) {
        int swap = 0;
        for (int i = 0; i < number.length - 1; i++) {
            if (swap == 0 && i > 0) {
                System.out.println("Array already sorted");
                break;
            }
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                    swap++;
                }
            }
        }
    }

    public static void printArr(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        sorting(number);
        printArr(number);
    }
}
