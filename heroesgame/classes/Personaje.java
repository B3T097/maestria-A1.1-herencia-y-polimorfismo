package heroesgame.classes;

public abstract class Personaje {
    private String nombre;
	private String color;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void moverArriba(){
        System.out.println("Se movio hacia Arriba");
    }

    public void moverAbajo(){
        System.out.println("Se movio hacia Abajo");
    }
    
    public void moverIzquierda(){
        System.out.println("Se movio a la Izquierda");
    }

    public void moverDerecha(){
        System.out.println("Se movio hacia la Derecha");
    }

    public abstract void atacar();
    public abstract void defender();
}   
