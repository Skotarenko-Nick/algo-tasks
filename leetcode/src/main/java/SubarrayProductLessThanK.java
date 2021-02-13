/**
 * <p>Your are given an array of positive integers nums.</p>
 * <p>
 * Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.
 * </p>
 * <p>
 * Example 1:
 * <p>
 * <br/>Input: nums = [10, 5, 2, 6], k = 100
 * <br/>Output: 8
 * <br/>Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
 * <br/>Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
 * </p>
 * <p>
 * Note:
 * <br/>0 < nums.length <= 50000.
 * <br/>0 < nums[i] < 1000.
 * <br/>0 <= k < 10^6.
 * </p>
 */
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        assert 8 == numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
    }

    /**
     * Pre calc: O-space(1), O-time(n)
     * End calc: O-space(1), O-time(n)
     */
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int product = 1, result = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            result += right - left + 1;
        }
        return result;
    }
}
