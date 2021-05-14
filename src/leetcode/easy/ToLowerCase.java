package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/to-lower-case/">
 *                 https://leetcode.com/problems/to-lower-case/</a>
 *
 */
public class ToLowerCase {

    public static void main(String[] args) {
        String input = "HeLLO&";
        System.out.println(toLowerCase(input));
    }

    /**
     *
     * @param str
     * @return a string after converting str into lowercase.
     */
    public static String toLowerCase(String str) {
        char [] chars = str.toCharArray();
        for (int i=0;i<str.length();i++) {
            // convert Uppercase to lowercase by adding 32
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                chars[i] = (char)(str.charAt(i) + 32);
            } else {
                chars[i] = str.charAt(i);
            }

        }

        return String.valueOf(chars);
    }
}
