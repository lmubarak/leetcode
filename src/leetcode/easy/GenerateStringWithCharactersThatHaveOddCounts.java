package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/">
 *                 https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/</a>
 *
 */
public class GenerateStringWithCharactersThatHaveOddCounts {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(generateTheString(n));
    }

    /**
     *
     * @param n
     * @return string contains odd number of occurrences for each character
     */
    public static String generateTheString(int n) {
        char [] chars = new char[n];
        for (int i=0;i<chars.length;i++) {
            chars[i] = 'a';
        }
        if (n % 2 == 0) {
            chars[chars.length - 1] = 'b';
        }
        return String.valueOf(chars);
    }
}
