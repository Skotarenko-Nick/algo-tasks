/**
 * <p>Given an array <code>A</code>&nbsp;of 0s and 1s, we may change up to <code>K</code>&nbsp;values from 0 to 1.</p>
 *
 * <p>Return the length of the longest (contiguous) subarray that contains only 1s.&nbsp;</p>
 *
 * <p>&nbsp;</p>
 *
 * <div bis_skin_checked="1">
 * <p><strong>Example 1:</strong></p>
 *
 * <pre><strong>Input: </strong>A = <span id="example-input-1-1">[1,1,1,0,0,0,1,1,1,1,0]</span>, K = <span id="example-input-1-2">2</span>
 * <strong>Output: </strong><span id="example-output-1">6</span>
 * <strong>Explanation: </strong>
 * [1,1,1,0,0,<u><strong>1</strong>,1,1,1,1,<strong>1</strong></u>]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.</pre>
 *
 * <div bis_skin_checked="1">
 * <p><strong>Example 2:</strong></p>
 *
 * <pre><strong>Input: </strong>A = <span id="example-input-2-1">[0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]</span>, K = <span id="example-input-2-2">3</span>
 * <strong>Output: </strong><span id="example-output-2">10</span>
 * <strong>Explanation: </strong>
 * [0,0,<u>1,1,<b>1</b>,<strong>1</strong>,1,1,1,<strong>1</strong>,1,1</u>,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong><span>Note:</span></strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 20000</code></li>
 * 	<li><code>0 &lt;= K &lt;= A.length</code></li>
 * 	<li><code>A[i]</code> is <code>0</code> or <code>1</code>&nbsp;</li>
 * </ol>
 * </div>
 * </div>
 */
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        assert 6 == longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        assert 10 == longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
    }

    /**
     * Pre calc: O-space(1), O-time(A*K)
     * End calc: O-space(1), O-time(n)
     */
    public static int longestOnes(int[] A, int K) {
        int zeroCount=0,start=0,res=0;
        for(int end=0;end<A.length;end++){
            if(A[end] == 0) zeroCount++;
            while(zeroCount > K){
                if(A[start] == 0) zeroCount--;
                start++;
            }
            res=Math.max(res,end-start+1);
        }
        return res;
    }
}
