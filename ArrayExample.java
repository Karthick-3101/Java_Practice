public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array size: " + numbers.length);
        
        // Accessing elements by index
        System.out.println("Element at index 2: " + numbers[2]);
        
        // Iterating over the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
