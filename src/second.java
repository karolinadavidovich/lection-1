import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c)");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        discriminantCalculation(a, b, c);
    }


    public static void discriminantCalculation(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("The quadratic equation has two distinct real roots:");
            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
        if (D == 0) {
            double x = -b / 2 * a;
            System.out.println("The quadratic equation has distinct real root:");
            System.out.println("Root: " + x);
        }
        if (D < 0) {
            System.out.println("The quadratic equation has no distinct real roots");
        }
    }
}
