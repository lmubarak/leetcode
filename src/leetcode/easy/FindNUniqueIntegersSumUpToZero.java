package leetcode.easy;

import leetcode.common.ArrayUtils;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/">
 *                 https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/</a>
 *
 */
public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        int n = 5;
        ArrayUtils.printArray(sumZero(n));
    }

    /**
     *
     * @param n
     * @return int array that contains unique numbers their sums equal to zero
     */
    public static int[] sumZero(int n) {
        int [] arr = new int[n];
        for (int i=0;i<n - 1;i+=2) {
            arr[i] = (i+1);
            arr[i+1] = -arr[i];
        }
        return arr;
    }


}
