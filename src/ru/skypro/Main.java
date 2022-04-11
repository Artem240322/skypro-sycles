package ru.skypro;

public class Main {
    // задача 1
    public static void main(String[] args) {
        int order = 0;
        while (order != 10) {
            order++;
            System.out.print(order + " Порядок чисел");
        }

        System.out.println();
        for (; order > 0; order--)
            System.out.print(order + " Порядок чисел");


        // Задача 2
        int friday = 1;
        for (int i = friday; i < 31; i += 7) {
            System.out.println("Сегодня пятница " + i + " число");
        }


        // Задача 3
        int currentYear = 2022;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i > currentYear - 200)
                System.out.println(i);
        }
    }
}







