import java.util.Deque;
import java.util.LinkedList;

/**
 * Author:Jude
 * Date:2021-12-26 下午4:01
 */

/*
  解析：利用栈lifo的特性，做两次
 */
public class lc_0232_MyQueue {
    Deque<Integer> in;
    Deque<Integer> out;

    /** Initialize your data structure here. */
    public void MyQueue() {
        in = new LinkedList<Integer>();
        out = new LinkedList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop(int x) {
        while (out.isEmpty()){
            in2out(x);
        }
        return out.pop();
    }

    /** Get the front element. */
    public int peek(int x) {
        while (out.isEmpty()) {
            in2out(x);
        }
        return out.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void in2out(int x){
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}
