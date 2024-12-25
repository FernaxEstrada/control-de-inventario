/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctrdeinventario;

/**
 *
 * @author achoc
 */
public class Deporte extends Producto {

    private String disciplina;

    public Deporte(String nombre, String descripcion, double precio, int descuento, int stock, String categoria, String disciplina) {
        super(nombre, descripcion, precio, descuento, stock, categoria);
        this.disciplina = disciplina;
    }

    public Deporte() {
        this("", "", 0.0, 0, 0, "", "");
    }

    @Override
    public double PrecioConDescuento() {
            double aux = ((getPrecio() * getDescuento()) / 100);
            return getPrecio() - aux;
    }

    @Override
    public String MostrarInformacion() {
        return "Deporte [ " + "nombre: " + getNombre() + ", descripcion: " + getDescripcion() + ", precio: " + getPrecio() + ", descuento: " + getDescuento() + ", stock: " + getStock() + ", categoria: " + getCategoria() + ", disciplina: " + disciplina + " ]";
    }

}
