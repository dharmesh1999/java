package Prectice;

//Apply Mearge sort to sort an array of String
//Sample input 1: arr = {"sun", "earth", "mars","mercury"}
//output 1: arr = {"earth", "mars", "mercury","sun"}
public class Easy {
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        // base
        if (lo == hi) {
            String[] A = { arr[lo] };
            return A;
        }
        // kaam
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(arr, lo, mid);
        String[] arr2 = mergeSort(arr, mid + 1, hi);
        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySamller(arr1[i], arr2[j])) {        //this very inmportant for this question  
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        while (i < m) {
            arr3[idx++] = arr1[i++];
        }
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    static boolean isAlphabeticallySamller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) { //str1 is smaller then str2  it return number of poinr smaller (return int value)
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        String[] output = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
