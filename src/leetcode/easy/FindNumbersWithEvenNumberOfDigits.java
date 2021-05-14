package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">
 *                 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/</a>
 *
 */
public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int [] arr = {12, 345, 2, 6, 7896};
        System.out.print(findNumbers(arr));
    }

    /**
     *
     * @param nums
     * @return the numbers of elements that have even number of digits.
     */
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i=0;i<nums.length;i++) {
            if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999)
                    || nums[i] == 100000) {
                result++;
            }
        }
        return result;
    }
}
