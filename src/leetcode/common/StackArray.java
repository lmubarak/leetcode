package leetcode.common;
/**
 *
 * @author lmubarak
 * @date May, 22 2021
 *
 * Stack is a data structure with concept of first in last out.
 * Stack is implemented using Arrays.
 */
public class StackArray implements Stack<Integer> {
    /**
     * Maximum number of elements that this stack can store.
     */
    public static final int DEFAULT_CAPACITY = 1000;
    /**
     * To indicate that stack is empty.
     */
    public static final int EMPTY_STACK_REFERENCE = -1;
    /**
     * reference to the top of the stack. Top equal to {@value EMPTY_STACK_REFERENCE} if empty.
     */
    private int top;
    /**
     * Actual stack to store elements (implemented using arrays)
     */
    private int [] arr;


    /**
     * Initialize stack with default capacity {@value DEFAULT_CAPACITY}
     */
    public StackArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     *
     * Initialize stack with given capacity.
     * @param capacity
     */
    public StackArray(int capacity) {
        this.top = EMPTY_STACK_REFERENCE;
        this.arr = new int[capacity];
    }


    /**
     *
     * @return true if the stack is empty. Otherwise, false.
     *      The stack will be empty if the top doesn't point to any element (top = -1).
     */
    @Override
    public boolean isEmpty() {
        return this.top == EMPTY_STACK_REFERENCE;
    }

    /**
     *
     * @return true of the stack if full. Otherwise, false.
     *      The stack will be full of the top is pointing to last element in the stack (top = MAX - 1).
     */
    @Override
    public boolean isFull() {
        return this.top == DEFAULT_CAPACITY - 1;
    }

    /**
     *
     * @return the element at the top of stack. Returning 0 if stack is empty.
     */
    @Override
    public Integer peek() {
        if (top == EMPTY_STACK_REFERENCE) {
            System.out.println("Stack is empty!");
            return 0;
        }

        return this.arr[top];
    }

    /**
     *
     * @return the element at the top of stack. Returning 0 if stack is empty.
     *      Element will be removed from the top of stack.
     */
    @Override
    public Integer pop() {
        if (top == EMPTY_STACK_REFERENCE) {
            System.out.println("Stack is empty!");
            return 0;
        }

        return this.arr[top--];
    }

    /**
     *
     * @param element to the top of the stack.
     */
    @Override
    public void push(Integer element) {
        if (this.isFull()) {
            System.out.println("Stack is full");
        }

        this.arr[++top] = element;
    }

    /**
     *
     * @return the current size of the stack.
     */
    @Override
    public int getSize() {
        return top + 1;
    }

    /**
     *
     * @return the capacity of the stack (return the full size of the stack)
     */
    @Override
    public int getStackCapacity() {
        return DEFAULT_CAPACITY;
    }

    /**
     *  To make the stack empty. Stack will be empty if top equal to {@value EMPTY_STACK_REFERENCE}
     */
    public void emptyStack() {
        top = EMPTY_STACK_REFERENCE;
    }


}
