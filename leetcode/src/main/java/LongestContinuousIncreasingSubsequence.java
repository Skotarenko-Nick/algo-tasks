/**
 * <p>Given an unsorted array of integers <code>nums</code>, return <em>the length of the longest <strong>continuous increasing subsequence</strong> (i.e. subarray)</em>. The subsequence must be <strong>strictly</strong> increasing.</p>
 *
 * <p>A <strong>continuous increasing subsequence</strong> is defined by two indices <code>l</code> and <code>r</code> (<code>l &lt; r</code>) such that it is <code>[nums[l], nums[l + 1], ..., nums[r - 1], nums[r]]</code> and for each <code>l &lt;= i &lt; r</code>, <code>nums[i] &lt; nums[i + 1]</code>.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [1,3,5,4,7]
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> The longest continuous increasing subsequence is [1,3,5] with length 3.
 * Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
 * 4.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> nums = [2,2,2,2,2]
 * <strong>Output:</strong> 1
 * <strong>Explanation:</strong> The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
 * increasing.
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
 * 	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
 * </ul>
 */
public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        assert 3 == findLengthOfLCIS(new int[]{1,3,5,4,7});
        assert 1 == findLengthOfLCIS(new int[]{2,2,2,2,2});
    }

    /**
     * Pre calc: O-space(1), O-time(n)
     * End calc: O-space(1), O-time(n)
     */
    public static int findLengthOfLCIS(int[] nums) {
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }
}
