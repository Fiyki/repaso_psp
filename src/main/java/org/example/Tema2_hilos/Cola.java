package org.example.Tema2_hilos;

import com.sun.source.tree.SynchronizedTree;

import java.util.LinkedList;
import java.util.Queue;

//La cola tiene maximo 5 elementos tiene dos mtodos uno para pedir y otro para dar si esta vacia pondra un wait para que los hilos esten en espera
// y notificara cuando un mensaje se consuma y el otro metodo pondra en espera cuando este llena y notificara cuando llegue un mensaje
public class Cola {
    final private int maximo = 5;
    Queue <String> mensajes = new LinkedList<>();
    public synchronized  String dar_mensaje() throws InterruptedException {
        while (mensajes.size()== 0){
            wait();
        }
        String cadena = mensajes.poll();
        notify();
        return cadena;
    }
    public synchronized void recibir_mensaje(String mensaje) throws InterruptedException {
        while (mensajes.size()== maximo){
            wait();
        }
        mensajes.offer(mensaje);
        notify();
    }
}
