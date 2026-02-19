package HM12Multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//Есть список чисел.
//Вам нужно вычислить квадрат каждого числа параллельно с использованием CompletableFuture.
//Выведите результаты квадратов чисел

public class SquaresOfNumbers {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = Arrays.asList(1, 23, 24, 25);
        squareOfNumber(numbers);
    }

    public static void squareOfNumber(List<Integer> numbers) throws ExecutionException, InterruptedException {
        List<Double> finalNumbers = new ArrayList<>();
        List<CompletableFuture<Double>> completableFuture = new ArrayList<>();

        for (int element : numbers) {
            CompletableFuture<Double> completableFutureList = CompletableFuture.supplyAsync(() -> Math.pow(element, 2));
            completableFuture.add(completableFutureList);
        }

        for (CompletableFuture<Double> future : completableFuture) {
            finalNumbers.add(future.get());
        }
        System.out.println(finalNumbers);
    }

}



