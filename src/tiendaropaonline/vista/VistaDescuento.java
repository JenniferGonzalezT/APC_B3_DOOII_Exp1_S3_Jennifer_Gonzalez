package tiendaropaonline.vista;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaDescuento {
    public void mostrarPrecioConDescuento(Component producto) {
        System.out.println("===============================================");
        System.out.println("             DETALLE DEL DESCUENTO");
        System.out.println("===============================================");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Categoría: " + producto.getCategoria());
        
        System.out.println("\nPrecio original: " + FormatoMoneda.CLP(producto.getPrecioOriginal()));
        System.out.println("Precio final: " + FormatoMoneda.CLP(producto.getPrecio()));
        System.out.println("Ahorro: " + FormatoMoneda.CLP(producto.getPrecioOriginal() - producto.getPrecio()));
        System.out.println("-----------------------------------------------");
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("===============================================");
    }
}
