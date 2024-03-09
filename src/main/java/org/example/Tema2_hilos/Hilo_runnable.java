package org.example.Tema2_hilos;

public class Hilo_runnable implements Runnable {
    private String historia;

    public Hilo_runnable(String mensaje){
    this.historia = mensaje;
    }
    @Override
    public void run() {
        int contador = 0;
        for (int i = 0; i < this.historia.length(); i++) {

            System.out.print(Thread.currentThread().getName()+" ");
            if (this.historia.length() <= 20) {
                System.out.println(this.historia.charAt(i));
            } else {
                if (contador >= 30 && this.historia.charAt(i) == ' ') {
                    System.out.println();
                    contador = 0;
                }

                System.out.println(this.historia.charAt(i));
                contador++;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
