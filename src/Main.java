import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество предметов:");
        Scanner scanner = new Scanner(System.in);
        int numberOfSubs = scanner.nextInt();
        int summa=0;
        for (int i = 1; i < numberOfSubs + 1; i++) {
            System.out.println("Введите оценку за предмет " + i);
            Scanner scanner1 = new Scanner(System.in);
            int grade = scanner1.nextInt();
            if (grade > 10) {
                System.out.println("Ошибка! Введите оценку от 1 до 10. Введите оценку еще раз");
                int grade2 = scanner1.nextInt();
                grade = grade2;
            }
        summa= summa + grade;
        }
        int averageGrade = (summa) / numberOfSubs;
        System.out.println("Средняя оценка: " + averageGrade);
    }
}