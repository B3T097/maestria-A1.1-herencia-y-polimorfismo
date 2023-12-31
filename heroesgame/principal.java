package heroesgame;

// import java.util.ArrayList;
// import java.util.Iterator;

import javax.swing.JOptionPane;

import heroesgame.classes.Equipo;
import heroesgame.classes.Personaje;
import heroesgame.classes.heroes.Arquero;
import heroesgame.classes.heroes.Espadachin;
import heroesgame.classes.heroes.Mago;
import heroesgame.classes.villanos.MonstruoAgua;
import heroesgame.classes.villanos.MonstruoAire;
import heroesgame.classes.villanos.MonstruoFuego;
import heroesgame.classes.villanos.MonstruoTierra;

/**
 * principal
 */
public class principal {
    public static void main(String[] args) {
        //#region PRIMERA ACTIVIDAD
        // ArrayList<Personaje> equipo = new ArrayList<>();
        String mensaje_personajes = "1.- Mago\n" + //
                "2.-Espadachin\n" + //
                "3.- Arquero\n" + //
                "4.- Monstruo de Aire\n" + //
                "5.- Monstruo de Fuego\n" + //
                "6.- Monstruo de Tierra\n" + //
                "7.- Monstruo de Agua";

        // Integer seleccion_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_personajes, "Seleccione un personaje", 3));  
        // String nombre_1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de su personaje", "Nombre", 3);  
        // String color_1 = JOptionPane.showInputDialog(null, "Ingrese el color de su personaje", "Color", 3);  
        // Integer seleccion_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_personajes, "Seleccione un personaje", 3));  
        // String nombre_2 = JOptionPane.showInputDialog(null, "Ingrese el nombre de su personaje", "Nombre", 3);  
        // String color_2 = JOptionPane.showInputDialog(null, "Ingrese el color de su personaje", "Color", 3);  
        // Integer seleccion_3 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_personajes, "Seleccione un personaje", 3));  
        // String nombre_3 = JOptionPane.showInputDialog(null, "Ingrese el nombre de su personaje", "Nombre", 3);  
        // String color_3 = JOptionPane.showInputDialog(null, "Ingrese el color de su personaje", "Color", 3);  

        // equipo.add(seleccionPersonaje(seleccion_1, nombre_1, color_1));
        // equipo.add(seleccionPersonaje(seleccion_2, nombre_2, color_2));
        // equipo.add(seleccionPersonaje(seleccion_3, nombre_3, color_3));

        // Iterator<Personaje> equipoIterator = equipo.iterator();
        // while (equipoIterator.hasNext()) {
        // 	Personaje peronaje = equipoIterator.next();
        //     // System.out.println(peronaje.getClass().getSimpleName() + " : " + peronaje + " : ");
        //     // peronaje.atacar();
        //     System.out.println(peronaje.toString());
        //     peronaje.atacar();
        //     peronaje.defender();
        // }
        //#endregion

        //#region SEGUNDA ACTIVIDAD CALSE CONTENEDORA
        Equipo<Personaje> equipo = new Equipo<Personaje>();
        int activo = 1;

        while (activo == 1) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccionar una accion\n 1.- Agregar personaje\n 2.- Eliminar ultimo\n 3.- Monstrar\n 4.- Salir"));
            switch (opcion) {
                case 1:
                    Integer seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_personajes, "Seleccione un personaje", 3));  
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de su personaje", "Nombre", 3);  
                    String color = JOptionPane.showInputDialog(null, "Ingrese el color de su personaje", "Color", 3);  
                    equipo.agregar(seleccionPersonaje(seleccion, nombre, color));
                    break;
                case 2:
                    String tipo = equipo.eliminar();
                    JOptionPane.showMessageDialog(null, tipo + " Eliminado", "Eliminado", 1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, equipo.mostrar());
                    break;
                case 4:
                    activo = 0;
                    break;
                default:
                    activo = 0;
                    break;
            }
        }

        //#endregion
    }

    private static Personaje seleccionPersonaje(Integer tipo, String nombre, String color){
        Personaje personaje;
        switch (tipo) {
            case 1:
                personaje =  new Mago(nombre, color);
                break;
            case 2:
                personaje =  new Espadachin(nombre, color);
                break;
            case 3:
                personaje =  new Arquero(nombre, color);
                break;
            case 4:
                personaje =  new MonstruoAire(nombre, color);
                break;
            case 5:
                personaje =  new MonstruoFuego(nombre, color);
                break;
            case 6:
                personaje =  new MonstruoTierra(nombre, color);
                break;
            case 7:
                personaje =  new MonstruoAgua(nombre, color);
                break;
            
            default:
                personaje = new Mago(nombre, color);
                break;
        }
        return personaje;
    }
}