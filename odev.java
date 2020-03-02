package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sayıyı giriniz");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sayi = Integer.parseInt(s);
        int i = 0;
        if (sayi == 0) {
            System.out.println("0'ın kuvvetleri olmaz");
        } else {

            System.out.println("n1 " + "n2 " + "n3 " + "n4\n");
            if (sayi < 0) {
                for (i = -1; i >= sayi; i--) {
                    System.out.println(i + "  " + i * i + "  " + i * i * i + "  " + i * i * i * i + "\n");
                }
            } else {
                for (i = 1; i <= sayi; i++) {
                    System.out.println(i + "  " + i * i + "  " + i * i * i + "  " + i * i * i * i + "\n");
                }
            }
        }
    }
}
