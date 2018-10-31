package com.yourname;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Программа 3
        System.out.println("Введите число чтобы послучить его факториал");
        int v;
        Scanner scanner = new Scanner(System.in);
        v = scanner.nextInt();
        if (v < 0) {
            System.out.println("Не правильное число");
        } else if (v == 0) {
            System.out.println("Факториал нуля равен 1");
        } else {
            int i = 1;
            for (int f = 2; f <= v; f++) {
                i *= f;
            }
            System.out.println("Факториал вашего числа равен " + i);


        }


    }
}
