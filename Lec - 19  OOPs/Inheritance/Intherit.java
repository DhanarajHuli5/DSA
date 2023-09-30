
public class Intherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// BASE / PARENT CLASS
class Animal {
    // properties
    String color;

    // functions
    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// DERIVED / CHILD CLASS
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}
