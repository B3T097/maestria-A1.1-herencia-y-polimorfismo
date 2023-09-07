package heroesgame.classes.villanos;

import heroesgame.classes.Personaje;

public class MonstruoTierra extends Personaje {

    public MonstruoTierra( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataca con Tierra");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con Tierra");
    }

    @Override
    public String toString() {
        return "Monstro de Tierra - " + this.getNombre() + " de color " + this.getColor();
    }
}
