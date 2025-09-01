package tiendaropaonline.modelo.carrito;

import tiendaropaonline.modelo.descuentos.Component;

/**
 * Comando concreto del patrón Command para agregar productos al carrito.
 */

public class AgregarProducto implements Command {
    private final Carrito carrito;
    private final Component producto;

    public AgregarProducto(Carrito carrito, Component producto) {
        this.carrito = carrito;
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        carrito.agregarProducto(producto);
    }
}
