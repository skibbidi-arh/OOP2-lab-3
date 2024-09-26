import java.util.Stack;

class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;
    private Stack<Integer> minStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }


    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        int poppedValue = mainStack.pop();

        if (poppedValue == maxStack.peek()) {
            maxStack.pop();
        }

        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }

        return poppedValue;
    }

    public int max() {
        if (maxStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return maxStack.peek();
    }

    public int min() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MaxStack stack = new MaxStack();


        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        System.out.println("Max: " + stack.max());  // Expected Output: 6

        //2
        stack.pop();
        System.out.println("Max after pop: " + stack.max());  // Expected Output: 5


        //3
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        System.out.println("Max: " + stack.max());  // Expected Output: 3
        System.out.println("Min: " + stack.min());  // Expected Output: 1
    }

    }

