package heroesgame.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
    private ArrayList<Personaje> equipo;

    public ArrayList<Personaje> getEquipo() {
        return equipo;
    }

    public void agregar(Personaje personaje) {
        this.equipo.add(personaje);
    }

    public void eliminar(){
        this.equipo.remove(0);
    }

    public String mostrar() {
        String lista = "";
        Iterator<Personaje> equipoIterator = equipo.iterator();
        while (equipoIterator.hasNext()) {
        	Personaje personaje = equipoIterator.next();
            System.out.println(personaje.toString());
            lista += personaje.getNombre() + "\n";
        }
        return lista;
    }
}