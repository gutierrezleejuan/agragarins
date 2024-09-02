package App;

import java.util.ArrayList;
import javax.swing.*;
import java.util.List;

public class Inventario {
    private List<Instrumento> instrumentos;

    public Inventario() {
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public void mostrarInventario() {
        StringBuilder inventario = new StringBuilder();
        for (Instrumento instrumento : instrumentos) {
            inventario.append(instrumento).append("\n");
        }
        JOptionPane.showMessageDialog(null, inventario.toString());
    }

    public Instrumento buscarInstrumento(String nombre) {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento.getNombre().equalsIgnoreCase(nombre)) {
                return instrumento;
            }
        }
        return null;
    }
}

