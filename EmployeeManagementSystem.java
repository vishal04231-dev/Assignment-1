class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String schoolName;

    Intern(String name, int id, double salary, String schoolName) {
        super(name, id, salary);
        this.schoolName = schoolName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("School/College: " + schoolName);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee m = new Manager("Ram", 101, 90000, 10);
        Employee d = new Developer("Shyam", 102, 40000, "Java");
        Employee i = new Intern("vishal", 103, 20000, "Chitkara University");

        m.displayDetails();
        System.out.println(" ");
        d.displayDetails();
        System.out.println(" ");
        i.displayDetails();
    }
}
