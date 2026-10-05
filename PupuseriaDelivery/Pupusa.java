package modelo;

public class Pupusa extends Producto {
    private String tipoMasa; // Ej: "Maíz" o "Arroz"
    private String relleno;  // Ej: "Queso con loroco", "Revuelta"

    // Constructor que utiliza super()
    public Pupusa(String relleno, String tipoMasa, double precioBase) {
        // Llamada al constructor de la superclase Producto
        super("Pupusa de " + relleno + " (" + tipoMasa + ")", precioBase);
        this.tipoMasa = tipoMasa;
        this.relleno = relleno;
    }

    // Getters y Setters específicos
    public String getTipoMasa() {
        return tipoMasa;
    }

    public String getRelleno() {
        return relleno;
    }

    @Override
    public String toString() {
        return super.toString() + " [Masa: " + tipoMasa + "]";
    }
}

//sub clase de pupusas