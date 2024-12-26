/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author achoc
 */
public class Electrodomesticos extends Producto {

    private String marca;
    private String modelo;

    public Electrodomesticos(String nombre, String descripcion, double precio, int descuento, int stock, String categoria, String marca, String modelo) {
        super(nombre, descripcion, precio, descuento, stock, categoria);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Electrodomesticos() {
        this("", "", 0.0, 0, 0, "", "", "");
    }

    @Override
    public double PrecioConDescuento() {
            double aux = ((getPrecio() * getDescuento()) / 100);
            return getPrecio() - aux;
    }

    @Override
    public String MostrarInformacion() {
        return "Electrodomesticos [ " + "nombre: " + getNombre() + ", descripcion: " + getDescripcion() + ", precio: " + getPrecio() + ", descuento: " + getDescuento() + ", stock: " + getStock() + ", categoria: " + getCategoria() + ", marca: " + marca + ", modelo: " + modelo + " ]";
    }

}
