package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">
 *                 https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/</a>
 *
 */
public class NumberOfStudentsDoingHomeworkAtGivenTime {

    public static void main(String[] args) {
        int [] startTime = {1, 2, 3};
        int [] endTime = {3, 2, 7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }

    /**
     *
     * @param startTime
     * @param endTime
     * @param queryTime
     * @return the number of students who will still doing their homework at queryTime.
     */
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i=0;i<startTime.length;i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                result++;
            }
        }
        return result;
    }
}
