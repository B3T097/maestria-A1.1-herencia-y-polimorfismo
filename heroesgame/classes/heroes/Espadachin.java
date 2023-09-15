package heroesgame.classes.heroes;

public class Espadachin extends Heroe {

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
