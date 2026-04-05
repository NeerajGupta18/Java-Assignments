import java.util.Scanner;

class Hillstations {
    String name;

    Hillstations(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("\nHill Station : " + name);
    }

    void famousfood() {
        System.out.println("Famous Food : ---");
    }

    void famousfor() {
        System.out.println("Famous For  : ---");
    }
}

class Manali extends Hillstations {
    Manali() {
        super("Manali");
    }

    void famousfood() {
        System.out.println("Famous Food : Siddu");
    }

    void famousfor() {
        System.out.println("Famous For  : Snow mountains");
    }
}

class Mussoorie extends Hillstations {
    Mussoorie() {
        super("Mussoorie");
    }

    void famousfood() {
        System.out.println("Famous Food : Maggi");
    }

    void famousfor() {
        System.out.println("Famous For  : Beautiful hills");
    }
}

class Mahabaleshwar extends Hillstations {
    Mahabaleshwar() {
        super("Mahabaleshwar");
    }

    void famousfood() {
        System.out.println("Famous Food : Strawberries");
    }

    void famousfor() {
        System.out.println("Famous For  : Viewpoints and cool climate");
    }
}

class Shimla extends Hillstations {
    Shimla() {
        super("Shimla");
    }

    void famousfood() {
        System.out.println("Famous Food : Chana Madra");
    }

    void famousfor() {
        System.out.println("Famous For  : Colonial architecture");
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Hill Station Menu =====");
            System.out.println("1. Manali");
            System.out.println("2. Mussoorie");
            System.out.println("3. Mahabaleshwar");
            System.out.println("4. Shimla");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Hillstations h;

            switch (choice) {
                case 1:
                    h = new Manali();
                    break;
                case 2:
                    h = new Mussoorie();
                    break;
                case 3:
                    h = new Mahabaleshwar();
                    break;
                case 4:
                    h = new Shimla();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    continue;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            h.display();
            h.famousfood();
            h.famousfor();

        } while (choice != 5);

        sc.close();
    }
}
