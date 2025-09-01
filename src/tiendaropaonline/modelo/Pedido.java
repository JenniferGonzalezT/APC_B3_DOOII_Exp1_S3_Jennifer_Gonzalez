package tiendaropaonline.modelo;

import java.util.ArrayList;
import java.util.List;
import tiendaropaonline.util.FormatoMoneda;

public class Pedido {
    private int idPedido;
    private Usuario usuario;
    private List<Producto> productos;
    private double total;

    public Pedido(int idPedido, Usuario usuario) {
        this.idPedido = idPedido;
        this.usuario = usuario;
        this.productos = new ArrayList<>();
        this.total = 0;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        calcularTotal();
    }
    
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        calcularTotal();
    }
    
    private void calcularTotal() {
        total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
    }
    
    public double getTotal() {
        return total;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public String toString() {
        return "Pedido #" + idPedido + " a nombre de " + usuario.getNombre() + " - Total: $" + FormatoMoneda.formatearCLP(total);
    }
}
