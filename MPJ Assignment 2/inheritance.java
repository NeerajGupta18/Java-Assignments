class Employee {
    double salary;
    String name;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void calculateSalary() {
    }

    void displaySalary(String message) {
        System.out.println(message + name + " : " + salary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        salary = salary + (salary * 0.50);
    }
}

class InternEmployee extends Employee {

    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        salary = salary + (salary * 0.25);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Employee[] employees = new Employee[4];

        employees[0] = new FullTimeEmployee("Neeraj", 30000);
        employees[1] = new InternEmployee("Rahul", 10000);
        employees[2] = new FullTimeEmployee("Aman", 40000);
        employees[3] = new InternEmployee("Priya", 12000);

        System.out.println("----- BEFORE HIKE -----");
        for (Employee emp : employees) {
            emp.displaySalary("");
        }

        System.out.println("\n----- AFTER HIKE -----");
        for (Employee emp : employees) {
            emp.calculateSalary();
            emp.displaySalary("");
        }
    }
}
