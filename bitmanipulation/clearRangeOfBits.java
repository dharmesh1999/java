package bitmanipulation;

public class clearRangeOfBits {
    public static int clearReangeOfBitMask(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        // int b = ~((~0) << (i));
        int b = (1 << i) - 1;
        System.out.println("b:" + b);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String args[]) {
        System.out.print(clearReangeOfBitMask(2515, 2, 7));
    }
}
