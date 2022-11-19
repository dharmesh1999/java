package bitmanipulation;

public class getSetClear {

    public static int getIthBit(int n, int i) {
        if ((n & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }

    public static int clearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return (n & bitMask);
    }

    public static void main(String args[]) {
        // System.out.print(getIthBit(10, 2));
        // System.out.print(setIthBit(10, 2));
        // System.out.print(clearIthBit(10, 1));
        System.out.print(clearIthBit(15, 2));

    }
}
