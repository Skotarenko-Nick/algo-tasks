/**
 * <p>Given two strings <b>s1</b> and <b>s2</b>, write a function to return true if <b>s2</b> contains the permutation of <b>s1</b>. In other words, one of the first string's permutations is the <b>substring</b> of the second string.</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><b>Example 1:</b></p>
 *
 * <pre><b>Input: </b>s1 = "ab" s2 = "eidbaooo"
 * <b>Output: </b>True
 * <b>Explanation:</b> s2 contains one permutation of s1 ("ba").
 * </pre>
 *
 * <p><b>Example 2:</b></p>
 *
 * <pre><b>Input:</b>s1= "ab" s2 = "eidboaoo"
 * <b>Output:</b> False
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li>The input strings only contain lower case letters.</li>
 * 	<li>The length of both given strings is in range [1, 10,000].</li>
 * </ul>
 */
public class PermutationInString {
    public static void main(String[] args) {
        assert checkInclusion("ab", "eidbaooo");
        assert !checkInclusion("ab", "eidboaoo");
        assert checkInclusion("ab", "ab");
    }

    /**
     * Pre calc: O-space(1), O-time(n^2)
     * End calc: O-space(1), O(l1+(l2−l1)).
     * where l1 is the length of string l1 and l2 is the length of string l2
     */
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1map = new int[26];
        int[] s2map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++)
            if (s1map[i] == s2map[i])
                count++;
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            int r = s2.charAt(i + s1.length()) - 'a', l = s2.charAt(i) - 'a';
            if (count == 26)
                return true;
            s2map[r]++;
            if (s2map[r] == s1map[r])
                count++;
            else if (s2map[r] == s1map[r] + 1)
                count--;
            s2map[l]--;
            if (s2map[l] == s1map[l])
                count++;
            else if (s2map[l] == s1map[l] - 1)
                count--;
        }
        return count == 26;
    }
}
