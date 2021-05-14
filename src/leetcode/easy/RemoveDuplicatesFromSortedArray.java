package leetcode.easy;

/**
 *
 * @author lmubarak
 * @Date April, 23 2021
 *
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String [] args) {
        int [] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // remove duplicates
        int len = removeDuplicates(nums);

        // print up to len
        for (int i=0;i<len;i++) {
            System.out.println(nums[i] + ",");
        }

    }

    /**
     *
     * @param nums
     * @return len at which the array will be contain unique elements.
     */
    public static int removeDuplicates(int [] nums) {
        // to store current unique number
        int recent = 0;
        for (int i=1;i<nums.length;i++) {
            // if recent saved element not equal to nums[i], then update recent
            if (nums[recent] != nums[i]) {
                nums[++recent] = nums[i];
            }
        }
        return recent + 1;
    }


}
