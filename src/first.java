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
        if (pointX >= x - r && pointX <= x + r && pointY >= y - r && pointY <= y + r) {
            System.out.println("The point is inside or on the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
    }
}