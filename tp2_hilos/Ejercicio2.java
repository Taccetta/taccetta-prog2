package tp2_hilos;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 extends Thread {
    private List<Integer> list;
    private String name;

    public Ejercicio2(List<Integer> list, String name) {
        this.list = list;
        this.name = name;
    }

    @Override
    public void run() {
        int index = 0;
        while (!list.isEmpty()) {
            int value = list.remove(0);
            int result = 1;
            for (int i = 2; i <= value; i++) {
                result *= i;
            }
            System.out.printf("Hilo %s procesando la lista. Valor a calcular: %d. Resultado: %d. Quedan %d elementos en la lista por procesar.%n",
                name, value, result, list.size());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Hilo %s ha terminado de procesar la lista.%n", name);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            list.add((int) (Math.random() * 13 + 3)); // Números aleatorios entre 3 y 15
        }

        Ejercicio2 thread1 = new Ejercicio2(new ArrayList<>(list), "1");
        Ejercicio2 thread2 = new Ejercicio2(new ArrayList<>(list), "2");
        Ejercicio2 thread3 = new Ejercicio2(new ArrayList<>(list), "3");
        Ejercicio2 thread4 = new Ejercicio2(list, "4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
