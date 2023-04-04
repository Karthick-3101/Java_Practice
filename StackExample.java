import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("is");
        stack.push("fun");

        System.out.println(stack);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
