package App;

import javax.swing.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SistemaGestionPrestamos {
    private Inventario inventario;
    private Map<String, Date> prestamos;

    public SistemaGestionPrestamos() {
        this.inventario = new Inventario();
        this.prestamos = new HashMap<>();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void prestarInstrumento(String nombre, String usuario, Date fecha) {
        Instrumento instrumento = inventario.buscarInstrumento(nombre);
        if (instrumento != null && instrumento.getCantidad() > 0) {
            instrumento.prestar();
            prestamos.put(usuario + " - " + nombre, fecha);
            JOptionPane.showMessageDialog(null, usuario + " ha prestado " + nombre + " el " + fecha);
        } else {
            JOptionPane.showMessageDialog(null, "Instrumento no disponible.");
        }
    }

    public void devolverInstrumento(String nombre) {
        Instrumento instrumento = inventario.buscarInstrumento(nombre);
        if (instrumento != null) {
            instrumento.devolver();
            JOptionPane.showMessageDialog(null, nombre + " ha sido devuelto.");
        } else {
            JOptionPane.showMessageDialog(null, "Instrumento no encontrado.");
        }
    }

    public void generarReportePrestamos() {
        StringBuilder reporte = new StringBuilder();
        for (Map.Entry<String, Date> entry : prestamos.entrySet()) {
            reporte.append(entry.getKey()).append(" - Fecha: ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, reporte.toString());
    }
}
