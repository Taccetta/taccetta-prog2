import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d años", apellido, nombre, edad);
    }

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");
        nombres.add("Luisa");
        nombres.add("Miguel");

        List<String> apellidos = new ArrayList<>();
        apellidos.add("González");
        apellidos.add("Pérez");
        apellidos.add("Sánchez");
        apellidos.add("Martínez");
        apellidos.add("Fernández");

        Random random = new Random();
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String nombre = nombres.get(i);
            String apellido = apellidos.get(i);
            int edad = random.nextInt(31) + 20; // Número aleatorio entre 20 y 50 años
            personas.add(new Persona(nombre, apellido, edad));
        }

        // Mostrar la lista de personas
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Buscar la persona más grande y mostrarla por pantalla
        Persona personaMayor = personas.get(0);
        for (int i = 1; i < personas.size(); i++) {
            if (personas.get(i).getEdad() > personaMayor.getEdad()) {
                personaMayor = personas.get(i);
            }
        }
        System.out.println("La persona de mayor edad es: " + personaMayor);
    }
}