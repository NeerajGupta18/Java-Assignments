import java.util.Scanner;

class Shapes {
    double area;

    // Constructor Overloading
    Shapes() {
        area = 0;
    }

    Shapes(double r) {
        area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }

    Shapes(double l, double b) {
        area = l * b;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method Overloading
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int base, int height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shapes s1 = new Shapes(r);

        // Rectangle
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Shapes s2 = new Shapes(l, b);

        Shapes s = new Shapes();

        // Square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        s.area(side);

        // Triangle
        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        s.area(base, height);

        sc.close();
    }
}
