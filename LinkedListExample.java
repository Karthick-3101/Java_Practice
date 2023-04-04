import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        // Adding elements to the list
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        // Printing the list
        System.out.println("Linked list: " + list);
        
        // Accessing elements by index
        System.out.println("Element at index 1: " + list.get(1));
        
        // Iterating over the list
        System.out.println("Iterating over the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        
        // Adding an element at the beginning of the list
        list.addFirst("grape");
        System.out.println("Linked list after adding a new element at the beginning: " + list);
        
        // Removing an element from the list
        list.remove(2);
        System.out.println("Linked list after removing an element: " + list);
    }
}
