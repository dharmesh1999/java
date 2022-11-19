package bitmanipulation;

public class numberIsPowerOfTwo {
    public static boolean checkIfNumberIsPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        System.out.print(checkIfNumberIsPowerOfTwo(15));
    }
}
