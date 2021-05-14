package leetcode.easy;

public class RemoveElement {
    public static void main(String[] args) {
        int [] ar = {0,1,2,2,3,0,4,2};
        int result = removeElement(ar, 2);

        for (int i=0;i<result;i++) {
            System.out.print(ar[i] + " ");
        }
        
    }


    public static int removeElement(int[] nums, int val) {
        int current = nums.length - 1;
        int temp;
        for (int i=0;i<nums.length;i++) {
            if (i == current) {
                break;
            }
            if (nums[i] == val) {
                //swap
                while (nums[current] == val) {
                    current--;
                }
                temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
                current--;
            }
        }
        return current + 1;
    }
}
