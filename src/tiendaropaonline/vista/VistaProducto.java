package tiendaropaonline.vista;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaProducto {
    public void mostrarProducto(Component producto) {
        System.out.println("\n============= DESCRIPCIÓN PRODUCTO ============");
        System.out.println("-> Nombre: " + producto.getNombre());
        System.out.println("-> Precio: " + FormatoMoneda.CLP(producto.getPrecio()));
        System.out.println("-> Categoría: " + producto.getCategoria());
        System.out.println("-> ID: " + producto.getIdProducto());
    }
}
