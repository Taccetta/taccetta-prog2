package tp2_hilos;

import java.util.Random;

public class Ejercicio1 extends Thread {
    private String nombre;
    private int iteraciones;
    private int demora;

    public Ejercicio1(String nombre) {
        this.nombre = nombre;
        this.iteraciones = new Random().nextInt(31) + 10;
        this.demora = new Random().nextInt(950) + 50;
    }

    @Override
    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            new Ejercicio1("Hilo extendiendo Thread " + i).start();
        }

        for (int i = 1; i <= 4; i++) {
            new Thread(new Ejercicio1Runnable("Hilo implementando Runnable " + i, 20, 500)).start();
        }
    }
}

class Ejercicio1Runnable implements Runnable {
    private String nombre;
    private int iteraciones;
    private int demora;

    public Ejercicio1Runnable(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    @Override
    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}