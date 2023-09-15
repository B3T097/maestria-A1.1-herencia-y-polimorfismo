package heroesgame.classes.heroes;

public class Arquero extends Heroe {

    public Arquero( String nombre, String color ){
        this.setNombre(nombre);
        this.setColor(color);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataca con Flecha");
    }

    @Override
    public void defender() {
        System.out.println("Defiende con escudo");
    }

    @Override
    public String toString() {
        return "Arquero - " + this.getNombre() + " de color " + this.getColor();
    }

}
