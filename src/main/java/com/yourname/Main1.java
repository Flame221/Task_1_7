package com.yourname;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Программа 4
        System.out.println("Введите число");
        float n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextFloat();
        double f = Math.sqrt(n);
        for (int i = 2; i < f; i++) {
            if (n % i == 0) {
                System.out.println("Это число не является простым");
                return;
            }
        }
        System.out.println("Это число является простым");
    }
}
