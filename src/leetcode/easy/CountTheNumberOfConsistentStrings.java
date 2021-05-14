package leetcode.easy;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 */
public class CountTheNumberOfConsistentStrings {

    public static void main(String[] args) {
      //  String allowed = "ab";
      //  String [] words = {"ad", "bd", "aaab", "baa", "badab"};
        String allowed = "abc";
        String [] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        int numberOfStrings = countConsistentStrings(allowed, words);
        System.out.println(numberOfStrings);

    }

    /**
     *
     * @param allowed
     * @param words
     * @return the number of consistent strings
     * consistent string: a string that all of its characters exist in allowed.
     */
    public static int countConsistentStrings(String allowed, String[] words) {
        // create a count array to indicate which characters are exist in allowed.
        boolean [] count = new boolean[26];
        for (int i=0;i<allowed.length();i++) {
            count[allowed.charAt(i) - 'a'] = true;
        }

        int numberOfStrings = 0;
        boolean check = true;
        for (int i=0;i<words.length;i++) {
            check = true;
            for (int j=0;j<words[i].length();j++) {
                // if the character in words[i] doesn't exist, then skip this string.
                if (!count[words[i].charAt(j) - 'a']) {
                    check = false;
                    break;
                }
            }
            if (check) {
                numberOfStrings++;
            }
        }
        return numberOfStrings;
    }
}
