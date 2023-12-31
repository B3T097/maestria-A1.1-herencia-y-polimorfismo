package heroesgame.classes.villanos;

public class MonstruoAire extends Villano {

    public MonstruoAire( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataca con Aire");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con Aire");
    }

    @Override
    public String toString() {
        return "Monstruo de Aire - " + this.getNombre() + " de color " + this.getColor();
    }
}
