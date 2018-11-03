package com.yourname;

//Программа 5
public class Main3 {
    public static void main(String[] args) {
        int s = 0;
        int z;
        for (int num = 1; num <= 50000; num++) {
            z = num;
            while (z > 0) {
                if (z % 10 == 2) {
                    s++;
                    break;
                } else {
                    z /= 10;
                }
            }
        }
        System.out.println(s);
    }
}
