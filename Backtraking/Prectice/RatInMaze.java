package Prectice;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class RatInMaze {

    public static boolean isSafe(int arr[][], int x, int y, int n) {
        if (x < n && y < n && arr[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static boolean ratInMaze(int arr[][], int x, int y, int n, int solArr[][]) {
        // basecondi
        if (x == n - 1 && y == n - 1) {
            solArr[x][y] = 1;
            return true;
        }
        if (isSafe(arr, x, y, n)) {
            solArr[x][y] = 1;
            if (ratInMaze(arr, x + 1, y, n, solArr)) {
                return true;
            }
            if (ratInMaze(arr, x, y + 1, n, solArr)) {
                return true;
            }
            solArr[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String args[]) {
        int n = 4;
        int arr[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int solArr[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

        if (ratInMaze(arr, 0, 0, n, solArr)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(solArr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
