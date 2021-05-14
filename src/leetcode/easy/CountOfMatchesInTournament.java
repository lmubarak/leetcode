package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 */
public class CountOfMatchesInTournament {

    public static void main(String[] args) {
        int numberOfTeams = 14;
        System.out.println(numberOfMatches(numberOfTeams));
    }

    /**
     *
     * @param n
     * @return the number of matches for n teams
     */
    public static int numberOfMatches(int n) {
        return n - 1;
    }
}
