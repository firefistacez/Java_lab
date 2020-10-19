package Interface;

public class StackWithout implements Stack{
    int stack[];
    int top;

    StackWithout(int size) {
        stack = new int[size];
        top=-1;
    }

    public void push(int item) {
        if(top == stack.length-1) {
            int temp[] = new int[stack.length*2];
            for(int i=0;i<stack.length;i++) {
                temp[i] = stack[i];
            }
            stack=temp;
            stack[++top] = item;
        }
        else {
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
