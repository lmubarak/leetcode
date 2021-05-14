package leetcode.easy;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 *
 */
public class SingleNumber {

    public static void main(String [] arg) {
        int [] ar = {4, 1, 2, 1, 2};
        int uniqueNumber = singleNumber(ar);
        System.out.println(uniqueNumber);
    }


    /**
     *
     * @param nums
     * @return the unique number from nums
     */
    public static int singleNumber(int[] nums) {
        int uniqueNumber = nums[0];
        for (int i=1;i< nums.length;i++) {
            uniqueNumber ^= nums[i];
        }
        return uniqueNumber;
    }
}
