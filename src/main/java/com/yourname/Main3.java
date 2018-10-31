package com.yourname;

//Программа 5
public class Main3 {
    public static void main(String[] args) {
        int s = 0;
        for (int num = 1; num <= 50000; num++) {
            if (num % 10 == 2) {
                s++;
            }
            if (num % 100 == 2) {
                s++;
            }
            if (num % 1000 == 2) {
                s++;
            }
            if (num % 10000 == 2) {
                s++;
            }
        }
        System.out.println("Нужно заменить " + s + " таблиц");


    }
}
