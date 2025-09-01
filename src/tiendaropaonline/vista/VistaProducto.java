package tiendaropaonline.vista;

import tiendaropaonline.modelo.Producto;
import tiendaropaonline.util.FormatoMoneda;

public class VistaProducto {
    public void mostrarProducto(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() +
            "\n-> Precio: " + FormatoMoneda.formatearCLP(producto.getPrecio()) +
            "\n-> Categoría: " + producto.getCategoria() +
            "\n-> ID: " + producto.getIdProducto()
        );
    }
}
