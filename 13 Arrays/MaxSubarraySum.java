// similer to subarray.java but here we have to find the maximum sum of all the subarrays
// time complexity: O(n^3)
// can be optimised to O(n^2) using kadane's algorithm

public class MaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum is: " + maxSum);
    }
}
