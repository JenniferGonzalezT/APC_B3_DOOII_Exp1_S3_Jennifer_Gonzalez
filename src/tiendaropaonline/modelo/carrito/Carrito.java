package tiendaropaonline.modelo.carrito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

/**
 * Receptor del patrón Command para agregar y eliminar productos del carrito.
 */

public class Carrito {
    private final List<Component> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Component producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(Component producto) {
        productos.remove(producto);
    }
    
    public List<Component> listarProductos() {
        return Collections.unmodifiableList(productos);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Component producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Carrito: " + productos.size() + " productos\nTotal: " + FormatoMoneda.CLP(calcularTotal());
    }
}
