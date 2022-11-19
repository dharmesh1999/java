package recursion;

public class TilingProblem {

    public static int tilingProblem(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalTiles = tilingProblem(n - 1);

        int horizontalTiles = tilingProblem(n - 2);
        int totalWays = verticalTiles + horizontalTiles;

        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tilingProblem(4));
    }
}
