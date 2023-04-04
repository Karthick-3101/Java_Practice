public class ControlStructuresExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
        
        i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
        
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is neither 1 nor 2");
        }
        
        int y = 5;
        if (y > 3) {
            System.out.println("y is greater than 3");
        } else {
            System.out.println("y is less than or equal to 3");
        }
        
        for (int j = 0; j < numbers.length; j++) {
            if (j == 2) {
                continue;
            }
            if (j == 4) {
                break;
            }
            System.out.println(numbers[j]);
        }
    }
}
