package leetcode.medium;

import leetcode.common.ListNode;

import java.util.List;

/**
 *
 * @author lmubarak
 * @date April, 24 2021
 *
 * @Check <a href="https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/">
 *                 https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/</a>
 *
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode x = new ListNode(9);
        ListNode x1 = new ListNode(9);
        ListNode x2 = new ListNode(9);
        ListNode x3 = new ListNode(9);
        ListNode x4 = new ListNode(9);
        ListNode x5 = new ListNode(9);
        ListNode x6 = new ListNode(9);
        x.next = x1;
        x1.next = x2;
        x2.next = x3;
        x3.next = x4;
        x4.next = x5;
        x5.next = x6;
        x6.next = null;

        ListNode y = new ListNode(9);
        ListNode y1 = new ListNode(9);
        ListNode y2 = new ListNode(9);
        ListNode y3 = new ListNode(9);


        y.next = y1;
        y1.next = y2;
        y2.next = y3;
        y3.next = null;
        ListNode result = addTwoNumbers(x, y);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        // let set result with l1
        int inHand = 0;
        int tempVal = 0;
        ListNode current;
        current = l1;
        while (l1 != null && l2 != null) {
            tempVal = current.val + l2.val + inHand;
            current.val = tempVal % 10;
            inHand = tempVal / 10;
            current = current.next;
            l2 = l2.next;
        }

        if (l2 != null) {
            current = l2;
        }
        while (current != null && current.next != null) {
            tempVal = current.val + inHand;
            current.val = tempVal % 10;
            inHand = tempVal / 10;
            current = current.next;
        }

        if (inHand == 1) {
            tempVal = current.val + inHand;
            current.val = tempVal % 10;
            inHand = tempVal / 10;
            if (inHand == 1) {
                ListNode toAdd = new ListNode(inHand);
                current.next = toAdd;
                toAdd.next = null;
            }
        }
    return l1;
    }
}
