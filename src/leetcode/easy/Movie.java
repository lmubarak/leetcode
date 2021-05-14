package leetcode.easy;

public class Movie {

    public String title;
    private int runningTime;

    public static void main(String[] args) {
       int [] nums = {1, 2, 3, 4, 15, 6};
       int result = 0;
       for (int i=0;i<nums.length;i++) {
            result ^= nums[i];
       }
       System.out.println(result);
    }

    public void setRunningTime(int runningTime) {
        if (runningTime > 0) {
            this.runningTime = runningTime;
        } else {
            this.runningTime = 5; // 5 mins
        }
    }
}
