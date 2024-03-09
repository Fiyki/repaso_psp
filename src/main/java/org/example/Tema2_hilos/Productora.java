package org.example.Tema2_hilos;

//Manda mensajes a la cola,variables,constructor
public class Productora implements Runnable {
    Cola cola;

    public Productora(Cola cola, String nombre) {
        Thread t1 = new Thread(this, nombre);
        this.cola = cola;
        t1.start();
    }

    // cada productor crea 10 mensajes
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Productor " + Thread.currentThread().getName() + " enviando mensaje....");
                cola.recibir_mensaje("Mensaje numero: " + i + " enviado por:" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
