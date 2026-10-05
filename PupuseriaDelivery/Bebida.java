package modelo;

public class Bebida extends Producto {
    private String tamano; // Ej: "Mediano", "Grande"
    private boolean esFria;

    // Constructor que utiliza super()
    public Bebida(String nombre, double precioBase, String tamano, boolean esFria) {
        // Llamada al constructor de la superclase Producto
        super(nombre, precioBase);
        this.tamano = tamano;
        this.esFria = esFria;
    }

    public String getTamano() {
        return tamano;
    }

    public boolean isEsFria() {
        return esFria;
    }

    @Override
    public String toString() {
        String temperatura = esFria ? "Helada" : "Caliente";
        return super.toString() + " [" + tamano + ", " + temperatura + "]";
    }
}


//Sub clase de y apartado de bebidas 