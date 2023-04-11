package TP2;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        // Crear un Set de empleados
        Set<Empleado> setEmpleados = new HashSet<>();
        
        // Crear 5 objetos empleado, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
        Empleado empleado1 = new Empleado("Juan", "Pérez", 123, 5);
        Empleado empleado2 = new Empleado("María", "Gómez", 234, 3);
        Empleado empleado3 = new Empleado("Juan", "Pérez", 123, 5);
        Empleado empleado4 = new Empleado("Pedro", "Martínez", 345, 7);
        Empleado empleado5 = new Empleado("Lucía", "García", 456, 2);
        
        setEmpleados.add(empleado1);
        setEmpleados.add(empleado2);
        setEmpleados.add(empleado3);
        setEmpleados.add(empleado4);
        setEmpleados.add(empleado5);
        
        // Iterar sobre el set y mostrar los objetos empleados
        System.out.println("Empleados en el Set:");
        for (Empleado empleado : setEmpleados) {
            System.out.println(empleado);
        }
        
        
        // Crear 5 objetos empleadoSet, donde 2 empleados tienen los mismos valores de atributos, agregarlos al set
        Set<EmpleadoSet> setEmpleadoSets = new HashSet<>();
        
        EmpleadoSet empleadoSet1 = new EmpleadoSet("Juan", "Pérez", 123, 5);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("María", "Gómez", 234, 3);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Juan", "Pérez", 123, 5);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Pedro", "Martínez", 345, 7);
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Lucía", "García", 456, 2);
        
        setEmpleadoSets.add(empleadoSet1);
        setEmpleadoSets.add(empleadoSet2);
        setEmpleadoSets.add(empleadoSet3);
        setEmpleadoSets.add(empleadoSet4);
        setEmpleadoSets.add(empleadoSet5);
        
        // Iterar sobre el set y mostrar los objetos empleados. Verificar que el duplicado no existe.
        System.out.println("Empleados en el Set de EmpleadoSet:");
        for (EmpleadoSet empleadoSet : setEmpleadoSets) {
            System.out.println(empleadoSet);
        }
    }
}