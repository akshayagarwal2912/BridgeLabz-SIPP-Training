class Person {
    String name;
    int age;

    //Parameterized Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Copy Constructor
    Person(Person other){
        this.name = other.name;
        this.age = other.age;
    }
    // Method to display person details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Main method to demonstrate the use of constructors
    public static void main(String[] args){
        Person p1 = new Person("Akshay", 22);
        Person p2 = new Person(p1);
        System.out.println("Original Person: ");
        p1.showDetails();
        System.out.println("Copied Person: ");
        p2.showDetails();
    }
}

