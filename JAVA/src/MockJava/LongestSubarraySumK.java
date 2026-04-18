package MockJava;

public class LongestSubarraySumK {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 6;

        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    int length = j - i + 1;
                    if (length > maxLen) {
                        maxLen = length;
                    }
                }
            }
        }

        System.out.println("Longest Length: " + maxLen);
    }
}