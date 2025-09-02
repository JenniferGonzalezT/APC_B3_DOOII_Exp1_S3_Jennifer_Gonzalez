package tiendaropaonline.vista;

import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaCarrito {
    public void mostrarCarrito(Carrito carrito) {
        System.out.println("\n============= CARRITO DE COMPRAS ==============");
        
        if (carrito.listarProductos().isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println(carrito);
            for (Component producto : carrito.listarProductos()) {
            System.out.println(" -> " + producto.getDescripcion() + " - Precio final " + FormatoMoneda.CLP(producto.getPrecio()));
            }
        }
    }
}
