package tiendaropaonline.modelo.carrito;

import tiendaropaonline.modelo.descuentos.Component;

/**
 * Comando concreto del patrón Command para eliminar productos del carrito.
 */

public class EliminarProducto implements Command {
    private Carrito carrito;
    private Component producto;

    public EliminarProducto(Carrito carrito, Component producto) {
        this.carrito = carrito;
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        carrito.eliminarProducto(producto);
        System.out.println("Producto eliminado del carrito: " + producto.getNombre());
    }
}
