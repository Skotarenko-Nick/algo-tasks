/**
 * <p>You are climbing a staircase. It takes <code>n</code> steps to reach the top.</p>
 *
 * <p>Each time you can either climb <code>1</code> or <code>2</code> steps. In how many distinct ways can you climb to the top?</p>
 *
 * <p>&nbsp;</p>
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input:</strong> n = 2
 * <strong>Output:</strong> 2
 * <strong>Explanation:</strong> There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * </pre>
 *
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input:</strong> n = 3
 * <strong>Output:</strong> 3
 * <strong>Explanation:</strong> There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * </pre>
 *
 * <p>&nbsp;</p>
 * <p><strong>Constraints:</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= n &lt;= 45</code></li>
 * </ul>
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        assert 2 == climbStairs(2);
        assert 3 == climbStairs(3);
    }

     /**
     * Pre calc: O-space(1), O-time(1)
     * End calc: O-space(1), O-time(1)
     */
    public static int climbStairs(int n) {
        double sqrt5=Math.sqrt(5);
        double fibn=Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
    }
}
