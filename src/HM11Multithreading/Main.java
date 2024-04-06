package HM11Multithreading;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Пользователь вводит с клавиатуры значение в массив.
        // После чего запускаются два потока. Первый поток находит максимум в массиве, второй - минимум.
        // Результаты вычислений возвращаются в метод main()
        ArrayMax arrayMax = new ArrayMax();
        Thread thread = new Thread(arrayMax);
        thread.start();


        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException("Exception");
        }
        ArrayMin arrayMin = new ArrayMin();
        Thread thread1 = new Thread(arrayMin);
        thread1.start();
    }
}
