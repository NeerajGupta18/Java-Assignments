class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void displaySalary(String message) {
        System.out.println(message + salary);
    }
}

class FullTimeEmployee extends Employee {

    FullTimeEmployee(double salary) {
        super(salary);
    }

    void calculateSalary() {
        salary = salary + (salary * 0.50); // 50% hike
    }
}

class InternEmployee extends Employee {

    InternEmployee(double salary) {
        super(salary);
    }

    void calculateSalary() {
        salary = salary + (salary * 0.25); // 25% hike
    }
}

public class inheritance {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee(30000);
        InternEmployee intern = new InternEmployee(10000);

        fte.displaySalary("Full Time Salary Before Hike: ");
        fte.calculateSalary();
        fte.displaySalary("Full Time Salary After Hike: ");

        System.out.println();

        intern.displaySalary("Intern Salary Before Hike: ");
        intern.calculateSalary();
        intern.displaySalary("Intern Salary After Hike: ");
    }
}
