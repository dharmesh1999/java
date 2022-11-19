package Prectice;

public class InversionCount {
    // Bruat Forse Method
    public static int getInvCount(int arr[]) {
        int n = arr.length - 1;
        int invCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    // Optimized
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static int mergeSort(int arr[], int left, int right) {
        int invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }

    public static int getInvCountOptimized(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        // System.out.println(getInvCount(arr));
        System.out.println(getInvCountOptimized(arr));

    }
}
