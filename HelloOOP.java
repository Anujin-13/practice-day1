class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void greet() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Person person = new Person("Anu", 19);
        person.greet();
    }
}