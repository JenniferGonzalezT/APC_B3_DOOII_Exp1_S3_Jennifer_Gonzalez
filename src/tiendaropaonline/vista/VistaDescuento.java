package tiendaropaonline.vista;

import tiendaropaonline.modelo.descuentos.Component;

public class VistaDescuento {
    public void mostrarPrecioConDescuento(Component producto) {
        System.out.println("Precio con descuento: $" + producto.getPrecio());
    }
}
