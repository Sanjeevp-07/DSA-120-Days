import java.util.*;

class MyStack {

    private Queue<Integer> que;

    public MyStack() {
        que = new LinkedList<>();
    }

    public void push(int x) {
        que.add(x);

        int size = que.size();

        while (size > 1) {
            que.add(que.remove());
            size--;
        }
    }

    public int pop() {
        return que.remove();
    }

    public int top() {
        return que.peek();
    }

    public boolean empty() {
        return que.isEmpty();
    }
}