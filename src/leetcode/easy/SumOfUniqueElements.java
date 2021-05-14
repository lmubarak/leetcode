package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/sum-of-unique-elements/">
 *                 https://leetcode.com/problems/sum-of-unique-elements/</a>
 *
 */
public class SumOfUniqueElements {

    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 2, 1, 5};
        System.out.println(sumOfUnique(arr));
    }

    /**
     *
     * @param nums
     * @return the sum of unique elements of nums.
     */
    public static int sumOfUnique(int[] nums) {
        int size = 100;
        int [] count = new int[size];
        for (int i=0;i<nums.length;i++) {
            count[nums[i] - 1]++;
        }

        int result = 0;
        for (int i=0;i<count.length;i++) {
            if (count[i] == 1) {
                result += i+1;
            }
        }

        return result;
    }
}
