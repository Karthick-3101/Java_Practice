import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("is");
        queue.add("fun");

        System.out.println(queue);

        System.out.println("Front element is: " + queue.peek());

        queue.remove();
        queue.remove();

        System.out.println(queue);
    }
}
