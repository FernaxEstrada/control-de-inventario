/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author achoc
 */
public abstract class Producto {

    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private int descuento;
    private int stock;

//    Constructor con parametros
    public Producto(String nombre, String descripcion, double precio, int descuento, int stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.stock = stock;
        this.categoria = categoria;
    }

//    Constructor sin parametros 
    public Producto() {
        this("", "", 0.0, 0, 0, "");
    }

//    Metodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

//    Metodos Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

//    Metodos abstractos
    public abstract double PrecioConDescuento();

    public abstract String MostrarInformacion();

}
