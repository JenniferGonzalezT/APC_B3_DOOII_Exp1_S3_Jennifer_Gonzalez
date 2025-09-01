package tiendaropaonline.vista;

import tiendaropaonline.modelo.Producto;
import tiendaropaonline.util.FormatoMoneda;

public class VistaProducto {
    public void mostrarProducto(Producto producto) {
        System.out.println("===============================================");
        System.out.println("              DESCRIPCIÓN PRODUCTO");
        System.out.println("===============================================");
        System.out.println("-> Nombre: " + producto.getNombre());
        System.out.println("-> Precio: " + FormatoMoneda.CLP(producto.getPrecio()));
        System.out.println("-> Categoría: " + producto.getCategoria());
        System.out.println("-> ID: " + producto.getIdProducto());
        System.out.println("===============================================");
    }
}
