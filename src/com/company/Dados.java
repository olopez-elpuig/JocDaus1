package com.company;

import java.util.Scanner;

public class Dados {
    public Dados() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuantas veces quieres lanzar tus dados? ");

        int tiros = scanner.nextInt();
        int dadoUno;
        int dadoDos;
        int i;
        int[] num = new int[12];

        for (i = 0; i < tiros; ++i) {
            dadoUno = (int) (Math.random() * 6.0D) + 1;
            dadoDos = (int) (Math.random() * 6.0D) + 1;
            ++num[dadoUno + dadoDos - 1];
        }

        System.out.println("...Tu resultado ha sido");

        for (i = 1; i < 12; ++i) {
            System.out.println(i + 1 + " -> " + num[i] + " veces");
        }
    }
}
