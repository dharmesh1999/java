package recursion.Prectice;

public class FindKey {

    public static void serchKey(int arr[], int key, int idx) {
        // base
        if (idx == arr.length) {
            return;
        }

        // kaam
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        serchKey(arr, key, idx + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        serchKey(arr, 2, 0);
    }
}
