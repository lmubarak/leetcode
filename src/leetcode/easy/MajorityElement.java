package leetcode.easy;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 */
public class MajorityElement {

    public static void main(String [] args) {
        int [] ar = {2, 2, 1, 1, 1, 2, 2};
        int majorityElement = majorityElement(ar);
        System.out.println(majorityElement);
    }

    /**
     * @param nums
     * @return the majority element that exists more than 1/2 times.
     * Based on Boyer-Moore Voting Algorithm
     *
     */
    public static int majorityElement(int[] nums) {
        int counter = 0;
        int candidate = 0;

        for (int i=0;i<nums.length;i++) {
            if (counter == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                counter++;
            } else {
                counter--;
            }
        }

        return candidate;
    }
}
