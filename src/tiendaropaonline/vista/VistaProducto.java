package tiendaropaonline.vista;

import tiendaropaonline.modelo.Producto;

public class VistaProducto {
    public void mostrarProducto(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() +
            "\n-> Precio: $" + producto.getPrecio() +
            "\n-> Categoría: " + producto.getCategoria() +
            "\n-> ID: " + producto.getIdProducto()
        );
    }
}
