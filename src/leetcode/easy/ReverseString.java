package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/reverse-string/">
 *                 https://leetcode.com/problems/reverse-string/</a>
 *
 */
public class ReverseString {

    public static void main(String[] args) {
        char [] chars = {'l', 'a', 'i', 't', 'h'};
        reverseString(chars);
        System.out.println(String.valueOf(chars));
    }

    /**
     *
     * @param s
     */
    public static void reverseString(char[] s) {
        char temp;
        for (int i=0;i<s.length/2;i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
