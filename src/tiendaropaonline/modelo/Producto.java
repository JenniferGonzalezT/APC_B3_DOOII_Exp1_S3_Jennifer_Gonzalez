package tiendaropaonline.modelo;

import tiendaropaonline.util.FormatoMoneda;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(int idProducto, String nombre, double precio, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto " + idProducto + ": " + nombre + " " + FormatoMoneda.formatearCLP(precio) + "(" + categoria + ")";
    }
}
