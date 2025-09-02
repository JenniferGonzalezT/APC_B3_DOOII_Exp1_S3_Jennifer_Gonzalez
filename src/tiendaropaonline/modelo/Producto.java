package tiendaropaonline.modelo;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class Producto implements Component {
    private int idProducto;
    private String nombre;
    private double precio;
    private final double precioOriginal;
    private String categoria;

    public Producto(int idProducto, String nombre, double precio, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.precioOriginal = precio;
        this.categoria = categoria;
    }

    @Override
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public double getPrecioOriginal() {
        return precioOriginal;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getDescripcion() {
        return "Producto " + idProducto + ": " + nombre + " - " + FormatoMoneda.CLP(precio) +  " (" + categoria + ")";
    }
}
