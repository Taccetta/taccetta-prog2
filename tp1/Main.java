import interfaces.FiguraGeometrica;

import java.util.HashMap;
import java.util.HashSet;

import classes.*;
import exceptions.ExceptionError;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HashSet<Empleado> empleados = new HashSet<Empleado>();
        HashSet<EmpleadoSet> empleadosset = new HashSet<EmpleadoSet>();

        Empleado empleado1 = new Empleado("Juan", "Perez", "58411", 5);
        Empleado empleado2 = new Empleado("Maria", "Gutierrez", "52854", 2);
        Empleado empleado3 = new Empleado("Juan", "Perez", "58411", 5);
        Empleado empleado4 = new Empleado("Joaquin", "Gonzalez", "12345", 7);
        Empleado empleado5 = new Empleado("Franco", "Martinez", "15962", 15);

        empleados.addAll(Arrays.asList(empleado1, empleado2, empleado3, empleado4, empleado5));

        EmpleadoSet[] empleadosSet = {
            new EmpleadoSet("Juan", "Perez", "58411", 5),
            new EmpleadoSet("Maria", "Gutierrez", "52854", 2),
            new EmpleadoSet("Juan", "Perez", "58411", 5),
            new EmpleadoSet("Joaquin", "Gonzalez", "12345", 7),
            new EmpleadoSet("Franco", "Martinez", "15962", 15)
        };
        
        for(EmpleadoSet emp : empleadosSet) {
            if(!empleadosset.contains(emp)) {
                empleadosset.add(emp);
            }
        }
        
        for(Empleado empleado: empleados) {
            System.out.println(empleado);
        }
        System.out.println('\n');
        for(EmpleadoSet emp : empleadosset) {
            System.out.println(emp);
        }

        System.out.println('\n');

        ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

        try {
            figuras.add(new Circulo(2, 5, 5));
            figuras.add(new Circulo(10.2, 5, 8));
            figuras.add(new Rectangulo(24, 36, 6, 2.36));
            figuras.add(new Rectangulo(12, 22.8, 9.9, 2.2));
            figuras.add(new Pentagono(7, 8.2, 5.65, 3));
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        for(FiguraGeometrica f: figuras){
            System.out.println(f);
        }

        System.out.println('\n');

        System.out.println("Circle");
        try {
            Circulo circuloneg = new Circulo(-2, 8, -9);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulorad = new Circulo(5, 12, 23);
            circulorad.setRadio(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulocoorx = new Circulo(5, 12, 23);
            circulocoorx.setCoordenadaX(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulocoory = new Circulo(5, 12, 23);
            circulocoory.setCoordenadaY(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println("\n");

        System.out.println("Rectangle");
        try {
            Rectangulo rectanguloneg = new Rectangulo(-2, -5.2, 8, -9);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulobase = new Rectangulo(32, 6.82, 8, 1);
            rectangulobase.setBase(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectanguloalt = new Rectangulo(32, 6.82, 8, 1);
            rectanguloalt.setAltura(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulocoorx = new Rectangulo(32, 6.82, 8, 1);
            rectangulocoorx.setCoordenadaX(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulocoory = new Rectangulo(32, 6.82, 8, 1);
            rectangulocoory.setCoordenadaY(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println("\n");

        System.out.println("Pentagon");
        try {
            Pentagono pentagononeg = new Pentagono(-7, -4.21, -5, 1);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonolad = new Pentagono(5, 9.34, 10, 11);
            pentagonolad.setLado(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonoapo = new Pentagono(5, 9.34, 10, 11);
            pentagonoapo.setApotema(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonocoorx = new Pentagono(5, 9.34, 10, 11);
            pentagonocoorx.setCoordenadaX(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonocoory = new Pentagono(5, 9.34, 10, 11);
            pentagonocoory.setCoordenadaY(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println("\nEjercicio 6");

        ArrayList<Empleado> empleadosejer6 = new ArrayList<Empleado>();
        empleadosejer6.addAll(Arrays.asList(empleado1, empleado2, empleado3, empleado4, empleado5));

        HashMap<String, Empleado> mapEmpleados = new HashMap<String, Empleado>();

        for(Empleado emp: empleadosejer6){
            mapEmpleados.put(emp.getApellido() + ", " + emp.getNombre(), emp);
        }
        mapEmpleados.forEach((clave, valor) -> System.out.println(clave + " = " + valor));

        System.out.println("\n");

        try {
            Empleado empleado = Empleado.createEmpleado("nomBRE= Pedro,  apelliDO =Dominguez,  LeGAjo=    15815,   aniosTRABAJADos= 20");
            System.out.println(empleado);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println();

        try {
            Empleado empleado = Empleado.createEmpleado("nombBRE= Pedro,  apelliDO =Dominguez,  LeGAjo=    15815,   aniosTRABAJADos= -20");
            System.out.println(empleado);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.createEmpleado("nombBRE= Pedro,  apelliDO =Dominguez,  aniosTRABAJADos= 20");
            System.out.println(empleado);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Empleado empleado = Empleado.createEmpleado("nombBRE= Pedro,  apelliDO =Dominguez,  LeGAjo=,   aniosTRABAJADos= 20");
            System.out.println(empleado);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

    }
}