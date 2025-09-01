package tiendaropaonline.modelo.carrito;

import tiendaropaonline.modelo.descuentos.Component;

/**
 * Comando concreto del patrón Command para agregar productos al carrito.
 */

public class AgregarProducto implements Command {
    private Carrito carrito;
    private Component producto;

    public AgregarProducto(Carrito carrito, Component producto) {
        this.carrito = carrito;
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        carrito.agregarProducto(producto);
        System.out.println("Producto agregado al carrito: " + producto.getNombre());
    }
}
