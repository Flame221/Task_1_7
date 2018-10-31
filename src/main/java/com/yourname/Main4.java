package com.yourname;

public class Main4 {
    public static void main(String[] args) {
        //Программа 2

        {
            int i = 0;
            int n = 1;
            while (i < 10000) {
                n *= 2;
                i = 2 * n - 1 - 1;
                if (i < 10000) {
                    System.out.println(i);
                }
            }
        }
    }
}