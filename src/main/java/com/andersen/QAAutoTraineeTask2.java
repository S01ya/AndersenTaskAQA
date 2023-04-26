package main.java.com.andersen;

import java.util.Scanner;

public class QAAutoTraineeTask2 {
    // Составить алгоритм: если введенное имя совпадает с Вячеслав,
    // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

    public static String readFromConsole(Scanner scanner) {
        String s = scanner.nextLine();
        return s;
    }

    public static void print() {
        String expected = "Вячеслав";
        System.out.println("введите имя");
        Scanner scanner = new Scanner(System.in);
        String actual = QAAutoTraineeTask2.readFromConsole(scanner);
        if (actual.equals(expected)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void main(String[] args) {
        QAAutoTraineeTask2.print();
    }
}
