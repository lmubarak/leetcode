package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution for TwoSum question using HashMap.
 *
 * @see <a>https://leetcode.com/problems/two-sum/</a>
 *
 * @author lmubarak
 * @since July 20, 2021
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}

	/**
	 * Return the indexes of two numbers such that they add up to target.
	 * Example: nums = [1, 2, 5, 6], target = 3
	 * 		    return [0, 1]
	 *
	 * @param nums passed array of int to look into.
	 * @param target sum of the required two numbers.
	 * @return the array of size 2 contains indexes of the two numbers in nums.
	 */
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		// Add all numbers to map.
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		// Start with each element as this element is the first number.
		for (int i = 0; i < nums.length; i++) {
			// Find a second number.
			if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
				return new int[] { map.get(target - nums[i]), i };
			}
		}

		// In case nothing found.
		return new int[1];
	}

	/**
	 * Another solution by iterating over the array just one time.
	 *
	 * @param nums passed array of int to look into.
	 * @param target sum of the required two numbers.
	 * @return the array of size 2 contains indexes of the two numbers in nums.
	 */
	public static int[] twoSumAlternative(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		// Start with each element as this element is the first number.
		for (int i = 0; i < nums.length; i++) {
			// Find a second number.
			if (map.containsKey(target - nums[i])) {
				return new int[] { i, map.get(target - nums[i])};
			}
			// Add the number to the map.
			map.put(nums[i], i);
		}

		// In case nothing found.
		return new int[1];
	}

}
