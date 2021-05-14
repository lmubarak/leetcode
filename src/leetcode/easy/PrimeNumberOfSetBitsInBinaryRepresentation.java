package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/">
 *                 https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/</a>
 *
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(6, 10));
    }

    public static int countPrimeSetBits(int L, int R) {
        int primesCount = 0;
        int temp;
        for (int i=L;i<=R;i++) {
            temp = Integer.bitCount(i);
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7 || temp == 11
                    || temp == 13 || temp == 17 || temp == 19 || temp == 23) {
                primesCount++;
            }
        }
        return primesCount;
    }
}
