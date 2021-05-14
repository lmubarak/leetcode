package leetcode.easy;

import leetcode.common.ListNode;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">
 *                 https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/</a>
 *
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode x = new ListNode(1);
        ListNode y = new ListNode(0);

        head.next = x;
        x.next = y;
        y.next = null;
        int result = getDecimalValue(head);
        System.out.print(result);

    }

    public static int alternativeWay(ListNode head) {
        int result = head.val;
        head = head.next;
        while (head != null) {
            result = (result << 1) + head.val;
            head = head.next;
        }
        return result;
    }

    public static int getDecimalValue(ListNode head) {
        int [] arr = new int[30];
        int numberOfElements = 0;
        while (head != null) {
            arr[numberOfElements++] = head.val;
            head = head.next;
        }
        int result = 0;
        for (int i=0;i<numberOfElements;i++) {
            if (arr[i] == 1) {
                result += 1 << (numberOfElements - 1 - i);
            }
        }

        return result;
    }
}
