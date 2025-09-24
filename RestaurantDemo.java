interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " (Chef) is cooking " + specialty);
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef c = new Chef("Arjun", 201, "Italian Cuisine");
        Waiter w = new Waiter("Ramesh", 301, 5);

        c.performDuties();
        w.performDuties();
    }
}
