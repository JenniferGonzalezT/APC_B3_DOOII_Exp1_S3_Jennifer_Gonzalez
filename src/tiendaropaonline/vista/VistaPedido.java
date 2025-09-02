package tiendaropaonline.vista;

import tiendaropaonline.modelo.Pedido;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.util.FormatoMoneda;

public class VistaPedido {
    public void mostrarPedido(Pedido pedido) {
        System.out.println("\n============= RESUMEN DEL PEDIDO ==============");
        System.out.println("ID del pedido: " + pedido.getIdPedido());
        System.out.println("Cliente: " + pedido.getUsuario().getNombre());
        System.out.println("-----------------------------------------------");
        System.out.println("Productos:");
        for (Component producto : pedido.getCarrito().listarProductos()) {
            System.out.println("-> " + producto.getDescripcion() + " - Precio final " + FormatoMoneda.CLP(producto.getPrecio()));
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Total: " + FormatoMoneda.CLP(pedido.getTotal()));
    }
}
