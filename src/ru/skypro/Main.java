package ru.skypro;

public class Main {
    // задача 1
    public static void main(String[] args) {
        int order = 0;
        while (order!=10){
            order++;
            System.out.print(order+" ");
        }

        System.out.println();
        for (;order>0;order--)
        System.out.print(order + " ");
    }
}




