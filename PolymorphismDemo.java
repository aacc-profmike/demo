// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
    void move() {
        System.out.println("The animal is moving...");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphic references
        Animal a1 = new Dog();  // Animal reference to Dog object
        Animal a2 = new Cat();  // Animal reference to Cat object

        // Runtime polymorphism: actual method is determined at runtime
        a1.makeSound();  // Outputs: Dog barks
        a2.makeSound();  // Outputs: Cat meows
    }
}
