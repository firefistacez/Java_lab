package Interface;

public class StackWith implements Stack {
    int stack[];
    int top;

    StackWith(int size) {
        stack = new int[size];
        top=-1;
    }

    public void push(int item) {
        if(top != stack.length) {
            stack[++top] = item;
        }
    }

    public int pop() {
        if(top>=0) {
            return stack[top--];
        }
        return 0;
    }
}
