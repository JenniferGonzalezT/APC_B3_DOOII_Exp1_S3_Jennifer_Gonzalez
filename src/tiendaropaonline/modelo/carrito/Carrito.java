package tiendaropaonline.modelo.carrito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.modelo.descuentos.DiscountManager;
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
        productos.removeIf(p -> p.getIdProducto() == producto.getIdProducto());
    }
    
    public List<Component> listarProductos() {
        List<Component> productosConDescuento = new ArrayList<>();
        for (Component producto : productos) {
            producto = DiscountManager.getInstance().aplicarDescuento10(producto);
            producto = DiscountManager.getInstance().aplicarDescuentoCategoriaRopa(producto);
            productosConDescuento.add(producto);
        }
        return Collections.unmodifiableList(productosConDescuento);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Component producto : listarProductos()) {
            total += producto.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Carrito: " + productos.size() + " productos\nTotal: " + FormatoMoneda.CLP(calcularTotal());
    }
}
