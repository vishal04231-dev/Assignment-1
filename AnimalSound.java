class Animal {
    void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("chipp chipp");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Bird();

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
