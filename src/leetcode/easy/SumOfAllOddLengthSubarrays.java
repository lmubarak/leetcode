package leetcode.easy;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 */
public class SumOfAllOddLengthSubarrays {

    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
        int sum = alternativeWay(arr);
        System.out.println(sum);
    }

    /**
     *
     * @param arr
     * @return the sum of all possible contiguous sub-arrays with odd length
     */
    public static int sumOddLengthSubarrays(int[] arr) {
        int initialSum = 0;
        for (int i=0;i<arr.length;i++) {
            initialSum += arr[i];
        }
        int result = initialSum;
        int suffix = 3;
        while (suffix <= arr.length) {
            initialSum = 0;
            for (int i=0;i<suffix;i++) {
                initialSum += arr[i];
            }
            result += initialSum;
            for (int i=1;i<arr.length - suffix + 1;i++) {
                initialSum -= arr[i-1];
                initialSum += arr[suffix + i - 1];
                result += initialSum;
            }
            suffix += 2;
        }
        return result;
    }

    public static int alternativeWay(int [] arr){
        int initialSum = 0;
        for (int i=0;i<arr.length;i++) {
            initialSum += arr[i];
        }

        int result = initialSum;
        int suffix = 3;
        int sumToAdd = 0;
        int diff = 0;

        while (suffix <= arr.length) {
            sumToAdd = 0;
            diff = 0;

            if (arr.length > (suffix - 1) * 2) {
                for (int i=0;i<suffix - 1;i++) {
                    sumToAdd += (i+1) * (arr[i] + arr[arr.length - 1 - i]);
                    diff += arr[i] + arr[arr.length - 1 - i];
                }
                result += sumToAdd + ((initialSum - diff) * suffix);
            } else {
                sumToAdd = 0;
                for (int i=0;i<suffix;i++) {
                    sumToAdd += arr[i];
                }
                result += sumToAdd;
                for (int i=1;i<arr.length - suffix + 1;i++) {
                    sumToAdd -= arr[i-1];
                    sumToAdd += arr[suffix + i - 1];
                    result += sumToAdd;
                }
            }

            suffix += 2;
        }
        return result;
    }
}
