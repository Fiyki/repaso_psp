package org.example.Tema2_hilos;

//crear tres consumidores y tres productores
public class Wait_Notify_Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        for (int i = 0; i < 3; i++) {
            new Productora(cola, "productor " + String.valueOf(i));
            new Consumidora(cola, "Consumidora " + String.valueOf(i));
        }
    }
}
