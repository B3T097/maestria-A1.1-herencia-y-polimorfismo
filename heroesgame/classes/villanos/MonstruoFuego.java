package heroesgame.classes.villanos;

public class MonstruoFuego extends Villano {

    public MonstruoFuego( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataca con Fuego");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con Fuego");
    }

    @Override
    public String toString() {
        return "Monstruo de Fuego - " + this.getNombre() + " de color " + this.getColor();
    }
}
