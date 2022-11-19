import java.util.Scanner;
import java.util.*;

public class matrices {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = 3;// int n = matrinx.length;
        int m = 3;// int m = matri[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
            System.out.println();

        }
        System.out.println("largest : " + largest);
        System.out.println("Smallest : " + smallest);
    }
}
