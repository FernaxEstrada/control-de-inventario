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
public class Ropa extends Producto {

    private String material;
    private String talla;

    public Ropa(String nombre, String descripcion, double precio, int descuento, int stock, String categoria, String material, String talla) {
        super(nombre, descripcion, precio, descuento, stock, categoria);
        this.material = material;
        this.talla = talla;
    }

    public Ropa() {
        this("", "", 0.0, 0, 0, "", "", "");
    }

    @Override
    public double PrecioConDescuento() {
            double aux = ((getPrecio() * getDescuento()) / 100);
            return getPrecio() - aux;
    }

    @Override
    public String MostrarInformacion() {
        return "Ropa [ " + "nombre: " + getNombre() + ", descripcion: " + getDescripcion() + ", precio: " + getPrecio() + ", descuento: " + getDescuento() + ", stock: " + getStock() + ", categoria: " + getCategoria() + ", material: " + material + ", talla: " + talla + " ]";
    }

}
