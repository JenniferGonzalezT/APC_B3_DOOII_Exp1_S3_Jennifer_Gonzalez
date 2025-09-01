package tiendaropaonline.modelo.carrito;

import tiendaropaonline.modelo.descuentos.Component;

/**
 * Comando concreto del patrón Command para eliminar productos del carrito.
 */

public class EliminarProducto implements Command {
    private final Carrito carrito;
    private final Component producto;

    public EliminarProducto(Carrito carrito, Component producto) {
        this.carrito = carrito;
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        carrito.eliminarProducto(producto);
    }
}
