/**
 *Given an integer number <code>n</code>, return the difference between the product of its digits and the sum of its digits.
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> n = 234
 * <strong>Output:</strong> 15
 * <b>Explanation:</b>
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> n = 4421
 * <strong>Output:</strong> 21
 * <b>Explanation:
 * </b>Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= n &lt;= 10^5</code></li>
 * </ul>
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        assert 15 == subtractProductAndSum(234);
        assert 21 == subtractProductAndSum(4421);
    }

    /**
     * Pre calc: O-space(1), O-time(n)
     * End calc: O-space(1), O-time(n)
     */
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0){
            int cur = n % 10;
            sum += cur;
            product *= cur;
            n = n / 10;
        }
        return product - sum;
    }
}
