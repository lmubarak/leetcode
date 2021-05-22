package leetcode.common;
/**
 *
 * @author lmubarak
 * @date May, 22 2021
 *
 * Stack is a data structure with concept of first in last out.
 * An interface for stack.
 * @param <T>
 */
public interface Stack<T> {

    boolean isEmpty();

    boolean isFull();

    T peek();

    T pop();

    void push(T element);

    int getSize();

    int getStackCapacity();

    void emptyStack();
}
