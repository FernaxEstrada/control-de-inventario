/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctrdeinventario;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author achoc
 */
public class Inventario {

    public static final int MAX = 100;

    private Producto Inv[];
    private int ultimo;

    public Inventario() {
        this.Inv = new Producto[MAX + 1];
        this.ultimo = -1;
    }

    public int cantidad() {
        return ultimo + 1;
    }

    public boolean vacia() {
        return (ultimo == -1);
    }

    public boolean llena() {
        return (ultimo == MAX);
    }

    public void registrar(Producto x) {
        if (llena()) {
            JOptionPane.showMessageDialog(null, "Error: El inventario se encuentra lleno");
            System.exit(0);
        }
        ultimo++;
        Inv[ultimo] = x;
    }

    private double CalcularPrecioTotalR(int dim) {
        if (dim == 1) {
            return Inv[0].getPrecio();
        } else {
            double aux = CalcularPrecioTotalR(dim - 1);
            return Inv[dim - 1].getPrecio() + aux;
        }
    }
    public double CalcularPrecioTotal() {
        return CalcularPrecioTotalR(cantidad());
    }

    
    private double CalcularPrecioTotalDesR(int dim) {
        if (dim == 1) {
            return Inv[0].PrecioConDescuento();
        } else {
            double aux = CalcularPrecioTotalDesR(dim - 1);
            return Inv[dim - 1].PrecioConDescuento() + aux;
        }
    }

    public double CalcularPrecioTotalDes() {
        return CalcularPrecioTotalDesR(cantidad());
    }

    public void mostrar(JTable tabla) {
//        Recorremos la tabla para mostrar
        for (int i = 0; i <= ultimo; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(Inv[i].getNombre(), i, 1);
            tabla.setValueAt(Inv[i].getPrecio(), i, 2);
            tabla.setValueAt(Inv[i].getDescuento(), i, 3);
            tabla.setValueAt(Inv[i].PrecioConDescuento(), i, 4);
            tabla.setValueAt(Inv[i].getStock(), i, 5);
        }
    }

}
