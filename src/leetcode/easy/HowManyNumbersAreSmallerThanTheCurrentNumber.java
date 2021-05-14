package leetcode.easy;

import java.util.Arrays;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/richest-customer-wealth/">
 *                 https://leetcode.com/problems/richest-customer-wealth/</a>
 *
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr = nums.clone();
        Arrays.sort(nums);
        int [] result = new int[nums.length];
        for (int i=0;i<arr.length;i++) {
            result[i] = Arrays.binarySearch(nums, arr[i]);


        }
        return result;
    }
}
