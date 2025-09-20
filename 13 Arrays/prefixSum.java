// prefix sum array is better version of max subarray sum
// time complexity: O(n^2) -> O(n)
// prefix sum array is an array which stores the sum of all the elements from the start to the current index
// prefixSum[i] = arr[0] + arr[1] + ... + arr[i]
// to find the sum of a subarray from index i to j: sum = prefixSum[j] - prefixSum[i-1]
// if i = 0, then sum = prefixSum[j]
public class prefixSum {
    public static void maxSubarraySum(int numbers[]) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int prefixSum[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;

        // calculating prefix sum array
        prefixSum[0] = numbers[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
}
