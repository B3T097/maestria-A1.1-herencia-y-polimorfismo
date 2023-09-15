package heroesgame.classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo {
    private ArrayList<Personaje> equipo;
    public Equipo(){
        this.equipo = new ArrayList<>();
    }

    public ArrayList<Personaje> getEquipo() {
        return equipo;
    }

    public void agregar(Personaje personaje) {
        this.equipo.add(personaje);
    }

    public String eliminar(){
        String tipo = this.equipo.get(this.equipo.size() - 1).getNombre();
        this.equipo.remove(this.equipo.size() - 1);
        return tipo;
    }

    public String mostrar() {
        String lista = "";
        try {
            Iterator<Personaje> equipoIterator = equipo.iterator();
            while (equipoIterator.hasNext()) {
                Personaje personaje = equipoIterator.next();
                System.out.println(personaje.toString());
                lista += personaje.toString() + "\n";
            }
        } catch (Exception e) {
            lista = "La lista esta vacia"; 
        }
        return lista;
    }
}