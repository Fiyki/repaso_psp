package org.example.Tema2_hilos;

import java.util.Scanner;

public class Intro_hilos {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Empieza el programa, estamos usando el hilo main: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un mensaje: ");
        String mensaje = sc.nextLine();
        narrador(mensaje);
    }

    synchronized static void narrador(String historia) throws InterruptedException {
        int contador = 0;
        for (int i = 0; i < historia.length(); i++) {
            if (historia.length() <= 20) {
                System.out.print(historia.charAt(i));
            } else {
                if (contador >= 30 && historia.charAt(i) == ' ') {
                    System.out.println();
                    contador = 0;
                }

                System.out.print(historia.charAt(i));
                contador++;
            }
            Thread.sleep(250);
        }
    }
}
