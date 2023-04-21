package classes;

import java.util.ArrayList;
import java.util.Collections;


public class ListaGenerica<T extends Comparable<T>> {
    private ArrayList<T> lista;
    
    public ArrayList<T> getLista() {
        return lista;
    }
    
    public void agregar(T elemento) {
        lista.add(elemento);
    }
    
    public ArrayList<T> obtenerLista() {
        return lista;
    }
    
    public int cantidadElementos() {
        return lista.size();
    }
    
    public void agregarAlInicio(T elemento) {
        lista.add(0, elemento);
    }
    
    public void ordenar() {
        Collections.sort(lista);
    }
    
    public void desordenarLista() {
        Collections.shuffle(this.getLista());
    }
    

    public void agregarEnPosicion(int posicion, T elemento) {
        lista.add(posicion, elemento);
    }
    
    public T obtenerEnPosicion(int posicion) {
        return lista.get(posicion);
    }
    
    public T obtenerPrimerElemento() {
        return lista.get(0);
    }
    
    public T obtenerUltimoElemento() {
        return lista.get(lista.size() - 1);
    }
    
    public void removerEnPosicion(int posicion) {
        lista.remove(posicion);
    }
}