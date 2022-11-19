package Prectice;

//Given an array nums of size n, return the majority element. (MEDIUM) The majority element is the element that appears more 
//than ⌊n/2⌋ times.You may assume that the majority element always exists in the array.
//Sample Input 1: nums = [3,2,3]
//Sample Output 1: 3
//Sample Input 2: nums = [2,2,1,1,1,2,2]
//Sample Output 2: 2
//Constraints (extra Conditions):
//n == nums.length
//1 <= n <= 5 * 104
//-109 <= nums[i] <= 109 

public class Medium {
    // brute force
    // public static int majorityElements(int[] nums) {
    // int mejorityElements = nums.length / 2;

    // for (int i = 0; i < nums.length; i++) {
    // int count = 0;
    // for (int j = i; j < nums.length; j++) {
    // if (nums[i] == nums[j]) {
    // count++;
    // }
    // }
    // if (count > mejorityElements) {
    // return nums[i];
    // }
    // }
    // return 0;
    // }

    private static int countInRenge(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int mejorityElements(int[] nums, int lo, int hi) {
        // base
        if (lo == hi) {
            return nums[lo];
        }
        // kaam
        int mid = lo + (hi - lo) / 2;
        int left = mejorityElements(nums, lo, mid);
        int right = mejorityElements(nums, mid + 1, hi);

        if (left == right) {
            return left;
        }

        int leftCount = countInRenge(nums, left, lo, hi);
        int rightCount = countInRenge(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;

    }

    public static int mejorityElementsOptimized(int nums[]) {
        return mejorityElements(nums, 0, nums.length - 1);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 2, 1, 1, 2, 2, };
        // System.out.println(majorityElements(nums));

        System.out.println(mejorityElementsOptimized(nums));
    }
}
