package org.example.Tema2_hilos;

import java.util.ArrayList;
import java.util.Scanner;

public class Hilo_Runnable_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Thread> listahilos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("Dame un mensaje: ");
            String mensaje = sc.nextLine();

            listahilos.add(new Thread(new Hilo_runnable(mensaje),"Hilo"+String.valueOf(i)));
        }
        for (int i = 0; i < listahilos.size(); i++) {
            listahilos.get(i).start();
        }
    }
}
