/**
 * <p>
 * On a staircase, the <code>i</code>-th step has some non-negative cost <code>cost[i]</code> assigned (0 indexed).
 * </p><p>
 * Once you pay the cost, you can either climb one or two steps. You need to find minimum cost to reach the top of the floor, and you can either start from the step with index 0, or the step with index 1.
 * </p>
 *
 * <p><b>Example 1:</b><br>
 * </p><pre><b>Input:</b> cost = [10, 15, 20]
 * <b>Output:</b> 15
 * <b>Explanation:</b> Cheapest is start on cost[1], pay that cost and go to the top.
 * </pre>
 * <p></p>
 *
 * <p><b>Example 2:</b><br>
 * </p><pre><b>Input:</b> cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
 * <b>Output:</b> 6
 * <b>Explanation:</b> Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 * </pre>
 * <p></p>
 *
 * <p><b>Note:</b><br>
 * </p><ol>
 * <li><code>cost</code> will have a length in the range <code>[2, 1000]</code>.</li>
 * <li>Every <code>cost[i]</code> will be an integer in the range <code>[0, 999]</code>.</li>
 * </ol>
 * <p></p>
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        assert 15 == minCostClimbingStairs(new int[]{10, 15, 20});
        assert 0 == minCostClimbingStairs(new int[]{0, 0, 0});
    }

    /**
     * Pre calc: O-space(1), O-time(N)
     * End calc: O-space(1), O-time(N)
     */
    public static int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);
    }
}
