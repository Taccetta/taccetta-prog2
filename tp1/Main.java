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
            Circulo circuloneg = new Circulo(-5, 3, -2);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulorad = new Circulo(4, 5, 26);
            circulorad.setRadio(-3);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulocoorx = new Circulo(4, 5, 26);
            circulocoorx.setCoordenadaX(-2);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Circulo circulocoory = new Circulo(4, 5, 26);
            circulocoory.setCoordenadaY(-9);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println("\n");

        System.out.println("Rectangle");
        try {
            Rectangulo rectanguloneg = new Rectangulo(-5, -6, 7, -41);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulobase = new Rectangulo(58, 8, 9, 14);
            rectangulobase.setBase(-2);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectanguloalt = new Rectangulo(58, 8, 9, 14);
            rectanguloalt.setAltura(-1);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulocoorx = new Rectangulo(58, 8, 9, 14);
            rectangulocoorx.setCoordenadaX(-3);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Rectangulo rectangulocoory = new Rectangulo(58, 8, 9, 14);
            rectangulocoory.setCoordenadaY(-7);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        System.out.println("\n");

        System.out.println("Pentagon");
        try {
            Pentagono pentagononeg = new Pentagono(-5, -7, -2, 5);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonolad = new Pentagono(12,2, 5, 13);
            pentagonolad.setLado(-9);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonoapo = new Pentagono(12,2, 5, 13);
            pentagonoapo.setApotema(-5);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonocoorx = new Pentagono(12,2, 5, 13);
            pentagonocoorx.setCoordenadaX(-4);
        } catch (ExceptionError e) {
            System.out.println(e);
        }

        try {
            Pentagono pentagonocoory = new Pentagono(12,2, 5, 13);
            pentagonocoory.setCoordenadaY(-5);
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