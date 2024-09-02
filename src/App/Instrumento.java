package App;

public class Instrumento {
    private String nombre;
    private String tipo;
    private String estado;
    private int cantidad;

    public Instrumento(String nombre, String tipo, String estado, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void prestar() {
        if (cantidad > 0) {
            cantidad--;
        }
    }

    public void devolver() {
        cantidad++;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Estado: " + estado + " - Cantidad: " + cantidad;
    }
}
