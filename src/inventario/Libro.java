/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.Arrays;

/**
 *
 * @author achoc
 */
public class Libro extends Producto {

    private String autor;

    public Libro(String nombre, String descripcion, double precio, int descuento, int stock, String categoria, String autor) {
        super(nombre, descripcion, precio, descuento, stock, categoria);
        this.autor = autor;
    }

    public Libro() {
        this("", "", 0.0, 0, 0, "", "");
    }

    @Override
    public double PrecioConDescuento() {
            double aux = ((getPrecio() * getDescuento()) / 100);
            return getPrecio() - aux;
    }

    @Override
    public String MostrarInformacion() {
        return "Libro [ " + "nombre: " + getNombre() + ", descripcion: " + getDescripcion() + ", precio: " + getPrecio() + ", descuento: " + getDescuento() + ", stock: " + getStock() + ", categoria: " + getCategoria() + ", autor: " + autor + " ]";
    }

}
