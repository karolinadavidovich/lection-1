package HM7Generic;

//Практическое ДЗ по этой теме (1 задачка на дженерики):
//Реализовать класс Pair, который будет содержать 2 значения любого типа. Класс умеет выводить:
//first() - возвращает 1ый элемент
//last() - возвращает 2ой элемент
//swap() - меняет элементы местами
//replaceFirst() - заменяет 1ый элемент на новый
//replaceLast() - заменяет 2ой элемент на новый

public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair<>("Object 1", 2425, "New object");

        System.out.println("First object = " + pair.getFirstObj());
        System.out.println("Second object = " + pair.getSecondObj());

        System.out.println(pair);

        System.out.println(pair.replaceFirstToString());

        System.out.println(pair.replaceSecondToString());
    }
}
