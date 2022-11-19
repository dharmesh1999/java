package recursion;

public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int sunOfNum(int n) {
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        sum += (n + sunOfNum(n - 1));
        return sum;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;
        if (arr[i] > arr[i + 1]) {
            return false;
        } else {
            return isSorted(arr, i + 1);
        }
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);

    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int powerOptimized(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int halfPower = powerOptimized(x, n / 2);
        int halfpowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfpowerSq = x * halfpowerSq;
        }
        return halfpowerSq;
    }

    public static void main(String args[]) {
        int n = 25;
        int arr[] = { 1, 2, 6, 3, 3, 5 };
        // printDec(n);
        // printInc(n);
        // System.out.print(fact(n));
        // System.out.print(sunOfNum(n));
        // System.out.print(fib(n));
        // System.out.print(isSorted(arr, 0));
        // System.out.print(firstOccurence(arr, 3, 0));
        // System.out.print(lastOccurence(arr, 3, 0));
        // System.out.println(power(10, 4));
        System.out.println(powerOptimized(10, 4));

    }
}
