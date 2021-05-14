package leetcode.easy;
/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/richest-customer-wealth/">
 *                 https://leetcode.com/problems/richest-customer-wealth/</a>
 *
 */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},
                            {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int customerWealth = 0;
        for (int i=0;i<accounts.length;i++) {
            customerWealth = 0;
            for (int j=0;j<accounts[i].length;j++) {
                customerWealth += accounts[i][j];
            }
            if (customerWealth > max) {
                max = customerWealth;
            }
        }
        return max;
    }
}
