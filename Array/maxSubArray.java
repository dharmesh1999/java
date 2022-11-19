public class maxSubArray {
    public static int maxSumSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // Subbarray Sum
                    currSum += numbers[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        return maxSum;
    }

    // optimized code of maxSum of sub array
    public static int maxSumWithPrefixSubArray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int preFix[] = new int[numbers.length];

        // calculate prefix array
        preFix[0] = numbers[0];
        for (int i = 1; i < preFix.length; i++) {
            preFix[i] = preFix[i - 1] + numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = i == 0 ? preFix[j] : preFix[j] - preFix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void kadanAlgo(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Our max subarray sum is : " + maxSum );
    }

    public static void main(String args[]) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanAlgo(number);
        // System.out.print(maxSumSubArray(number));
        // System.out.print(maxSumWithPrefixSubArray(number));

    }
}
