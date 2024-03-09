package org.example.Tema2_hilos;

import java.util.ArrayList;
import java.util.Scanner;

// pedir el numero y el mensaje crear los 3 hilos y meter el hilo en una lista
public class Hilos_01_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Thread> listahilos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Dame un numero: ");
            int numero = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.print("Dame un mensaje: ");
            String mensaje = sc.nextLine();

            listahilos.add(new Hilos_01(mensaje, numero));
        }
        for (int i = 0; i < listahilos.size(); i++) {
            listahilos.get(i).start();
        }
    }
}
