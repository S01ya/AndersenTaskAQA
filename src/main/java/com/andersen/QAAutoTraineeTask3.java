package main.java.com.andersen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QAAutoTraineeTask3 {
    //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число n, размер массива ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100); //заполнение массива случайными числами от 0 до 99 включ.
        }
        System.out.println("сгенерированный массив: ");
        System.out.println((Arrays.toString(array)));
        return array;
    }

    public static void checkArray() {
        int count = 0;
        int[] array = QAAutoTraineeTask3.createArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                count++;
                System.out.println("Число кратное 3 в данном массиве: " + array[i]);
            }
        }
        if (count == 0) {
            System.out.println("В данном массиве отсутствуют числа кратные 3");
        }
    }

    public static void main(String[] args) {
        QAAutoTraineeTask3.checkArray();
    }
}


