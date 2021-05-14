package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/">
 *                 https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/</a>
 *
 */
public class MaximumProductOfTwoElementsInAnArray {

    public static void main(String[] args) {
        int [] arr = {1, 5, 4, 5};
        System.out.println(maxProduct(arr));
    }

    /**
     *
     * @param nums
     * @return the max product of the max two values of nums such that:
     *                  maxProduct: nums[firstMaxIndex] - 1) * (nums[secondMaxIndex] - 1)
     */
    public static int maxProduct(int[] nums) {
        int maxIndex = 0;
        int secondMaxIndex = 1;

        if (nums[secondMaxIndex] > nums[maxIndex]) {
            maxIndex = 1;
            secondMaxIndex = 0;
        }

        for (int i=2;i<nums.length;i++) {
            if (nums[maxIndex] < nums[i]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (nums[secondMaxIndex] < nums[i]) {
                secondMaxIndex = i;
            }
        }
        return (nums[maxIndex] - 1) * (nums[secondMaxIndex] - 1);
    }
}
