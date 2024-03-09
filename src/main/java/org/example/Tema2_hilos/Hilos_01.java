package org.example.Tema2_hilos;

// para covertir una clase en hilo se usa el extends Thread
public class Hilos_01 extends Thread {
    private String mensaje;
    private int numero;
    public Hilos_01(String uno){
     this.mensaje = uno;
    }
    public Hilos_01(String uno,int numero){
        this.mensaje = uno;
        this.numero = numero;
    }
    public Hilos_01(){

    }

    @Override
    public void run() {

        System.out.println(this.numero);
        try {

            while (true){
                Intro_hilos.narrador(this.mensaje);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
