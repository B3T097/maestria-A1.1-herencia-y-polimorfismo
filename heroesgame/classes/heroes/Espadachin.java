package heroesgame.classes.heroes;

import heroesgame.classes.Personaje;

public class Espadachin extends Personaje {

    public Espadachin( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con Espada");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con escudo");
    }

    @Override
    public String toString() {
        return "Espadachin - " + this.getNombre() + " de color " + this.getColor();
    }
    
    
}
