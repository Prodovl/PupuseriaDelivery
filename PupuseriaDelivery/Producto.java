package modelo;

public class Producto {
    protected String nombre;
    protected double precioBase;

    // Constructor base
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // Método para calcular el precio (puede ser sobreescrito)
    public double calcularPrecio() {
        return precioBase;
    }

    @Override
    public String toString() {
        return nombre + " - $" + String.format("%.2f", calcularPrecio());
    }
}

//Super clase que junta las caracteristicas en comun de los productos