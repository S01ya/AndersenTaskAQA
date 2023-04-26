package main.java.com.andersen;

import java.util.Scanner;

public class QAAutoTraineeTask1 {

    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”

    public static double readFromConsole(Scanner scanner) {
        try {
            String s = scanner.nextLine();
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("это не число. Попробуйте еще раз");
            return readFromConsole(scanner);
        }
    }

    public static void sayHi() {
        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        double number = QAAutoTraineeTask1.readFromConsole(scanner);
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Попробуйте еще раз");
            sayHi();
        }
    }

    public static void main(String[] args) {
        QAAutoTraineeTask1.sayHi();
    }
}
