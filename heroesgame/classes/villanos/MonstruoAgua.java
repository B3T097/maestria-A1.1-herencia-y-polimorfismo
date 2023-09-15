package heroesgame.classes.villanos;

public class MonstruoAgua extends Villano {

    public MonstruoAgua( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataca con Agua");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con Agua");
    }

    @Override
    public String toString() {
        return "Monstruo de Agua - " + this.getNombre() + " de color " + this.getColor();
    }
}
