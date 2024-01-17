import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x-coordinate and the y-coordinate of the center of the circle");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Enter the radius of the circle");
        int r = scanner.nextInt();
        System.out.println("Enter the x-coordinate and the y-coordinate of the point");
        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();
        if (Math.sqrt(Math.abs(x-pointX)*Math.abs(x-pointX)+Math.abs(y-pointY)*Math.abs(y-pointY))<r) {
            System.out.println("The point is inside or on the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
    }
}