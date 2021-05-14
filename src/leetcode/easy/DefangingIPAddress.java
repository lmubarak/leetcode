package leetcode.easy;

import java.util.ArrayList;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/defanging-an-ip-address/">
 *                 https://leetcode.com/problems/defanging-an-ip-address/</a>
 *
 */
public class DefangingIPAddress {

    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }

    public static String defangIPaddr(String address) {
        char [] chars = new char[address.length() + 6];
        int index = 0;
        for (int i=0;i<address.length();i++) {
            if (address.charAt(i) == '.') {
                chars[index++] = '[';
                chars[index++] = '.';
                chars[index] = (']');
            } else {
                chars[index] = address.charAt(i);
            }
            index++;
        }
        return String.valueOf(chars);
    }

    public static String alternativeWay(String address) {
        return address.replaceAll("[.]", "[.]");
    }
}
