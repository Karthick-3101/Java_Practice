public class ClassAndObjectsExample {
    public static void main(String[] args) {
        // Creating an object
        Person person = new Person("John", 30);
        
        // Accessing object fields
        String name = person.getName();
        int age = person.getAge();
        
        System.out.println(name + " is " + age + " years old.");
    }
}

class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}
