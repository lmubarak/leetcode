package leetcode.common;

/**
 *
 * @author lmubarak
 * @date May, 15 2021
 *
 * DoublyLinkedList is a LinkedList but with tails, that means every node has addition reference for the previous node {@link prev}.
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

    T value;
    DoublyLinkedList<T> next;
    DoublyLinkedList<T> prev;


    public DoublyLinkedList(T value) {
        this.value = value;
    }

    public DoublyLinkedList() {

    }

    /**
     *
     * @param head
     * @param value
     * @return a DoublyLinkedList where the {@link value} is inserted at the head
     */
    public DoublyLinkedList<T> insertAtHead(T value) {
        DoublyLinkedList<T> insertedNode = new DoublyLinkedList(value);
        insertedNode.prev = null;
        insertedNode.next = this;
        this.prev = insertedNode;

        return insertedNode;
    }

    /**
     *
     * @param value
     * @return DoublyLinkedList after inserting the {@link value} into a given DoublyLinkedList at the end of the list.
     */
    public DoublyLinkedList<T> insertAtTail(T value) {
        DoublyLinkedList<T> temp = this;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        DoublyLinkedList<T> insertedNode = new DoublyLinkedList(value);
        insertedNode.next = null;
        insertedNode.prev = temp;
        temp.next = insertedNode;

        return this;
    }

    /**
     *
     * @param target
     * @return the index at which first occurrence of {@link target} is found (started from 0).
     *        return -1 if the target isn't found.
     */
    public int findElement(T target) {
        int count = 0;
        DoublyLinkedList<T> temp = this;
        while (temp != null) {
            if (temp.value == target) {
                return count;
            }
            count++;
            temp = temp.next;
        }

        return -1;
    }

    /**
     *
     * @param target
     * Delete first occurrence of {@link target} for a given DoublyLinkedList.
     */
    public void deleteElement(T target) {
        DoublyLinkedList<T> temp = this;
        while (temp != null && temp.value != target){
            temp = temp.next;
        }

        if (temp != null && temp.value == target) {
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
        }
    }

    /**
     *
     * Print all elements with passed DoublyLinkedList.
     */
    public void printList() {
        DoublyLinkedList<T> temp = this;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
