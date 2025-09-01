package tiendaropaonline.vista;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaDescuento {
    public void mostrarPrecioConDescuento(Component producto) {
        System.out.println(producto.getDescripcion());
        System.out.println("-> Precio con descuento: " + FormatoMoneda.formatearCLP(producto.getPrecio()));
    }
}
