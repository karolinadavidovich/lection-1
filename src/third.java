import java.util.Random;

public class third {
    public static void main(String[] args) {
        Random random = new Random();
        int seconds = random.nextInt(28001);
        System.out.println(seconds);
        int hours = seconds / 3600;
        if (hours < 1) {
            System.out.println("Осталось меньше часа");
        }
        if (hours == 1) {
            System.out.println("Остался " + hours + " час");
        }
        if (hours >= 2 && hours <= 4) {
            System.out.println("Осталось " + hours + " часа");
        }
        if (hours > 4) {
            System.out.println("Осталось " + hours + " часов");
        }
    }
}
