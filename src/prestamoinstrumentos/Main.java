package prestamoinstrumentos;

import App.Instrumento;
import App.SistemaGestionPrestamos;
import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaGestionPrestamos sistema = new SistemaGestionPrestamos();

        // Agregar instrumentos al inventario
        sistema.getInventario().agregarInstrumento(new Instrumento("Guitarra", "Cuerdas", "Nuevo", 5));
        sistema.getInventario().agregarInstrumento(new Instrumento("Violín", "Cuerdas Frotadas", "Usado", 3));
        sistema.getInventario().agregarInstrumento(new Instrumento("Flauta", "Vientos o Maderas", "Nuevo", 4));

        // Mostrar inventario
        JOptionPane.showMessageDialog(null, "Inventario de instrumentos:");
        sistema.getInventario().mostrarInventario();

        // Solicitar el nombre del instrumento a prestar
        String instrumentoAPrestar = JOptionPane.showInputDialog("Ingrese el nombre del instrumento que desea prestar:");

        // Solicitar el nombre del usuario
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");

        // Prestar el instrumento
        sistema.prestarInstrumento(instrumentoAPrestar, nombreUsuario, new Date());

        // Mostrar inventario después del préstamo
        JOptionPane.showMessageDialog(null, "Inventario después del préstamo:");
        sistema.getInventario().mostrarInventario();

        // Generar reporte de préstamos
        JOptionPane.showMessageDialog(null, "Reporte de préstamos:");
        sistema.generarReportePrestamos();

        // Solicitar el nombre del instrumento a devolver
        String instrumentoADevolver = JOptionPane.showInputDialog("Ingrese el nombre del instrumento que desea devolver:");

        // Devolver el instrumento
        sistema.devolverInstrumento(instrumentoADevolver);

        // Mostrar inventario después de la devolución
        JOptionPane.showMessageDialog(null, "Inventario después de la devolución:");
        sistema.getInventario().mostrarInventario();
    }
}
