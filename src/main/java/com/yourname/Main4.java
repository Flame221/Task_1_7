package com.yourname;

public class Main4 {
    public static void main(String[] args) {
        //Программа 2

        {
            int i = 2;
            while (i < 10000) {
                i = 2 * i - 1;
                if (i < 10000) {
                    System.out.println(i);
                }
            }
        }
    }
}