/**
 * <p>Given a string <code>s</code>, find the length of the <b>longest substring</b> without repeating characters.</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "abcabcbb"
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> The answer is "abc", with the length of 3.
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "bbbbb"
 * <strong>Output:</strong> 1
 * <strong>Explanation:</strong> The answer is "b", with the length of 1.
 * </pre>
 *
 * <p><strong>Example 3:</strong></p>
 *
 * <pre><strong>Input:</strong> s = "pwwkew"
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * </pre>
 *
 * <p><strong>Example 4:</strong></p>
 *
 * <pre><strong>Input:</strong> s = ""
 * <strong>Output:</strong> 0
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
 * 	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
 * </ul>
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        assert 3 == lengthOfLongestSubstring("abcabcbb");
        assert 1 == lengthOfLongestSubstring("bbbbb");
        assert 3 == lengthOfLongestSubstring("pwwkew");
        assert 0 == lengthOfLongestSubstring("");
    }

    /**
     * Pre calc: O-space(n), O-time(n)
     * End calc: O-space(1), O-time(n)
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // characters
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
