public class GridWays {
    public static int gridWays(int i, int j, int n, int m) { // time (2 ^(m +n))
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static int gridWaysOptimized(int n, int m) { // O(n)
        int path = 1;
        for (int i = n; i < (m + n - 1); i++) {
            path *= i;
            path /= (i - n + 1);
        }
        return path;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        // System.out.println(gridWays(0, 0, n, m));
        System.out.println(gridWaysOptimized( n, m));

    }
}
