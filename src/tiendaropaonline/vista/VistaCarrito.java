package tiendaropaonline.vista;

import tiendaropaonline.modelo.carrito.Carrito;

public class VistaCarrito {
    public void mostrarCarrito(Carrito carrito) {
        System.out.println("\n===== CARRITO =====");
        System.out.println(carrito);
        carrito.mostrarProductos();
    }
}
