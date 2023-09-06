import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a, l, b, b1, b2, h, r;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        a = input.nextFloat();

        System.out.println("Enter the value of l: ");
        l = input.nextFloat();

        System.out.println("Enter the value of b: ");
        b = input.nextFloat();

        System.out.println("Enter the value of b1: ");
        b1 = input.nextFloat();

        System.out.println("Enter the value of b2: ");
        b2 = input.nextFloat();

        System.out.println("Enter the value of h: ");
        h = input.nextFloat();

        System.out.println("Enter the value of r: ");
        r = input.nextFloat();

        perimeter(a, l, b);
        area(a, l, b, b1, b2, h, r);
        circumference(r);
        surface_area(a, r, h, l);
        volume(b, r, h, l);
    }

    public static void perimeter(float a, float l, float b) {
        float square = 4 * a;
        System.out.println("Square is " + square);

        float rectangle = 2 * (l + b);
        System.out.println("Rectangle is " + rectangle);
    }

    public static void area(float a, float l, float b, float b1, float b2, float h, float r) {
        float square = a * a;
        System.out.println("Square is " + square);

        float rectangle = l * b;
        System.out.println("Rectangle is " + rectangle);

        float triangle = b * h / 2;
        System.out.println("Triangle is " + triangle);

        float trapezoid = ( b1 + b2) * h / 2;
        System.out.println("Trapezoid is " + trapezoid);

        float circle = (float) (Math.PI * r * r);
        System.out.println("Circle is " + circle);
    }

    public static void circumference (float r) {
        float c = (float) (2 * Math.PI *r);
        System.out.println("Circle is " + c);
    }

    public static void surface_area(float a, float r, float h, float l) {
        float cube = 6 * a * a;
        System.out.println("Cube is " + cube);

        float sphere = (float) (4 * Math.PI * r * r);
        System.out.println("Sphere is " + sphere);

        float cylinder = (float) (2 * Math.PI * r * h);
        System.out.println("Cylinder is " + cylinder);

        float cone = (float) (Math.PI * r * l);
        System.out.println("Cone is " + cone);
    }

    public static void volume(float b, float r, float h, float l) {
        float cone = b * h / 3;
        System.out.println("Cone is " + cone);

        float cylinder = b * h;
        System.out.println("Cylinder is " + cylinder);

        float sphere = (float) (4 * Math.PI * r * r * r / 3);
        System.out.println("Sphere is " + sphere);
    }
}