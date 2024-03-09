package org.example.Tema2_hilos;
//Consume los mensajes de la cola,variables,constructor
public class Consumidora implements Runnable {
    Cola cola;
    public Consumidora(Cola cola,String nombre){
        this.cola = cola;
        Thread t4 = new Thread(this,nombre);
        t4.start();
    }
    //lleva 10 mensajes
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            try {
                System.out.println(cola.dar_mensaje()+" Recibido por "+ Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
