package tiendaropaonline.vista;

import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaCarrito {
    public void mostrarCarrito(Carrito carrito) {
        System.out.println("\n===== CARRITO =====");
        System.out.println(carrito);
        for (Component producto : carrito.listarProductos()) {
            System.out.println(" -> " + producto.getDescripcion() + " - Precio final " + FormatoMoneda.formatearCLP(producto.getPrecio()));
        }
    }
}
