package classes;

public class EmpleadoSet extends Empleado {
    public EmpleadoSet(String nombre, String apellido, String legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }

    @Override
    public int hashCode() {
        return (int) this.getNombre().hashCode() * this.getApellido().hashCode() * this.getLegajo().hashCode() * getAniosTrabajados();
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof EmpleadoSet){
            EmpleadoSet empleado = (EmpleadoSet) o;
            return this.getNombre().equals(empleado.getNombre()) &&
                    this.getApellido().equals((empleado.getApellido())) &&
                    this.getLegajo().equals(empleado.getLegajo()) &&
                    this.getAniosTrabajados() == empleado.getAniosTrabajados();
        }

        return false;
    }
}
