package heroesgame.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo<T> {
    private ArrayList<T> equipo;
    public Equipo(){
        this.equipo = new ArrayList<>();
    }

    public ArrayList<T> getEquipo() {
        return equipo;
    }

    public void agregar(T personaje) {
        this.equipo.add(personaje);
    }

    public String eliminar(){
        // String tipo = this.equipo.get(this.equipo.size() - 1).getNombre();
        String tipo = "Personaje eliminado";
        this.equipo.remove(this.equipo.size() - 1);
        return tipo;
    }

    public String mostrar() {
        String lista = "";
        try {
            Iterator<T> equipoIterator = equipo.iterator();
            while (equipoIterator.hasNext()) {
                T personaje = equipoIterator.next();
                System.out.println(personaje.toString());
                lista += personaje.toString() + "\n";
            }
        } catch (Exception e) {
            lista = "La lista esta vacia"; 
        }
        return lista;
    }
}