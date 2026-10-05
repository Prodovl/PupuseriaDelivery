import modelo.Producto;
import modelo.Pupusa;
import modelo.Bebida;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos usando las subclases
        Pupusa pupusa1 = new Pupusa("Queso con Loroco", "Arroz", 1.25);
        Pupusa pupusa2 = new Pupusa("Chicharrón", "Maíz", 1.00);
        Bebida bebida1 = new Bebida("Horchata", 1.50, "Grande", true);

        // Impresión de información
        System.out.println("--- MENÚ PUPUSERÍA ---");
        System.out.println(pupusa1);
        System.out.println(pupusa2);
        System.out.println(bebida1);
    }
}


//Este es el archivo Main en el cual se llamaran los metodos y se ejecutara todo