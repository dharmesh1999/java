package recursion.Prectice;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // base

        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }
        // kaam
        // transfer top n-1 from src to helper usiing dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("Transfer Disk " + n + " from " + src + " to " + helper);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }
}
