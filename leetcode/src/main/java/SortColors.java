import org.apache.commons.lang3.ArrayUtils;

/**
 * <p>Given an array <code>nums</code> with <code>n</code> objects colored red, white, or blue, sort them <strong><a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> </strong>so that objects of the same color are adjacent, with the colors in the order red, white, and blue.</p>
 *
 * <p>We will use the integers <code>0</code>, <code>1</code>, and <code>2</code> to represent the color red, white, and blue, respectively.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 * <pre><strong>Input:</strong> nums = [2,0,2,1,1,0]
 * <strong>Output:</strong> [0,0,1,1,2,2]
 * </pre><p><strong>Example 2:</strong></p>
 * <pre><strong>Input:</strong> nums = [2,0,1]
 * <strong>Output:</strong> [0,1,2]
 * </pre><p><strong>Example 3:</strong></p>
 * <pre><strong>Input:</strong> nums = [0]
 * <strong>Output:</strong> [0]
 * </pre><p><strong>Example 4:</strong></p>
 * <pre><strong>Input:</strong> nums = [1]
 * <strong>Output:</strong> [1]
 * </pre>
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>n == nums.length</code></li>
 * 	<li><code>1 &lt;= n &lt;= 300</code></li>
 * 	<li><code>nums[i]</code> is <code>0</code>, <code>1</code>, or <code>2</code>.</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 * <p><strong>Follow up:</strong></p>
 *
 * <ul>
 * 	<li>Could you solve this problem without using the library's sort function?</li>
 * 	<li>Could you come up with a one-pass algorithm using only <code>O(1)</code> constant space?</li>
 * </ul>
 */

public class SortColors {
    public static void main(String[] args) {
        int[] colors = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(colors);
        assert ArrayUtils.isSorted(colors);
    }

    /**
     * Pre calc: O-space(1), O-time(n)
     * End calc: O-space(1), O-time(n)
     */
    public static void sortColors(int[] nums) {
        int beginning = 0, end = nums.length - 1, index = 0;
        while (index <= end) {
            //red
            if (nums[index] == 0) {
                nums[index] = nums[beginning];
                nums[beginning] = 0;
                beginning++;
            }
            //blue
            if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
                index--;
            }
            index++;
        }
    }
}
