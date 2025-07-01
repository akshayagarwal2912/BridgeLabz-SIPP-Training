// Superclass
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("This animal makes Sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Dog makes sound: Bhow! Bhow!");
    }
}

// Subclass Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Cat makes sound: Meow! Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println("Bird makes sound: Chii! Chii!");
    }
}

// Main class
public class AnimalSound {
    public static void main(String[] args) {
        Animal objDog = new Dog("Tommy", 2);
        Animal objCat = new Cat("Lilly", 5);
        Animal objBird = new Bird("Paaro", 1);

        objDog.makeSound();
        objCat.makeSound();
        objBird.makeSound();
    }
}
