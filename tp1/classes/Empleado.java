package classes;

import exceptions.ExceptionError;



public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", aniosTrabajados=" + aniosTrabajados +
                '}';
    }

    public static Empleado createEmpleado(String parametros) throws ExceptionError {
        String str = parametros.replaceAll(" ", "");
        String[] pares = str.split(",");
        String[] valores = new String[4];
    
        for(int i = 0; i < pares.length; i++) {
            String[] par = pares[i].split("=");
            String clave = par[0].toLowerCase();
            try {
                String valor = par[1];
                if(clave.equals("nombre") || clave.equals("apellido") || clave.equals("legajo") || clave.equals("aniostrabajados")) {
                    if(clave.equals("aniostrabajados") && Integer.valueOf(valor) < 0) {
                        throw new ExceptionError("'aniosTrabajados' cannot be negative.");
                    }
                    valores[i] = valor;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ExceptionError("One or more parameters have no value.");
            } catch (NumberFormatException e) {
                throw new ExceptionError("'aniosTrabajados' is not a valid number.");
            }
        }
    
        if(valores[0] == null || valores[1] == null || valores[2] == null || valores[3] == null) {
            throw new ExceptionError("One or more required parameters are missing.");
        }
    
        return new Empleado(valores[0], valores[1], valores[2], Integer.valueOf(valores[3]));
    }

}

