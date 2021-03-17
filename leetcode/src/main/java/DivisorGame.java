/**
 * <p>Alice and Bob take turns playing a game, with Alice starting first.</p>
 *
 * <p>Initially, there is a number <code>N</code>&nbsp;on the chalkboard.&nbsp; On each player's turn, that player makes a <em>move</em>&nbsp;consisting of:</p>
 *
 * <ul>
 * 	<li>Choosing&nbsp;any <code>x</code> with <code>0 &lt; x &lt; N</code> and <code>N % x == 0</code>.</li>
 * 	<li>Replacing&nbsp;the number&nbsp;<code>N</code>&nbsp;on the chalkboard with <code>N - x</code>.</li>
 * </ul>
 *
 * <p>Also, if a player cannot make a move, they lose the game.</p>
 *
 * <p>Return <code>True</code> if and only if Alice wins the game, assuming both players play optimally.</p>
 *
 * <p>&nbsp;</p>
 *
 * <ol>
 * </ol>
 *
 * <div bis_skin_checked="1">
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input: </strong><span id="example-input-1-1">2</span>
 * <strong>Output: </strong><span id="example-output-1">true</span>
 * <strong>Explanation:</strong> Alice chooses 1, and Bob has no more moves.
 * </pre>
 *
 * <div bis_skin_checked="1">
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input: </strong><span id="example-input-2-1">3</span>
 * <strong>Output: </strong><span id="example-output-2">false</span>
 * <strong>Explanation:</strong> Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>Note:</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= N &lt;= 1000</code></li>
 * </ol>
 * </div>
 * </div>
 */
public class DivisorGame {
    public static void main(String[] args) {
        assert divisorGame(2);
        assert !divisorGame(3);
    }

    /**
     * Pre calc: O-space(1), O-time(1)
     * End calc: O-space(1), O-time(1)
     */
    public static boolean divisorGame(int N) {
        return N % 2 == 0;
    }
}
