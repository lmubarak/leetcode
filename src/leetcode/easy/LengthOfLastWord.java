package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/length-of-last-word/">
 *                 https://leetcode.com/problems/length-of-last-word/</a>
 *
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World ";
        System.out.println(lengthOfLastWord(s));
    }

    /**
     *
     * @param s
     * @return the len of the last word exist in s,
     *          a word is only consists from non white space characters.
     */
    public static int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (int i=s.length() - 1;i>=0;i--) {
            if (Character.isWhitespace(s.charAt(i))) {
                break;
            }
            len++;
        }
        return len;
    }
}
