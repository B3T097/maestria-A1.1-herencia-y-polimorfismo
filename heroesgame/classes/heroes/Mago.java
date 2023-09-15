package heroesgame.classes.heroes;

public class Mago extends Heroe{

    public Mago( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }

    @Override
    public void atacar() {
        System.out.println("Ataca con hechizos");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con hechizos");
    }

    @Override
    public String toString() {
        return "Mago - " + this.getNombre() + " de color " + this.getColor();
    }

    
}
