package tiendaropaonline.modelo;

import java.util.ArrayList;
import java.util.List;
import tiendaropaonline.util.FormatoMoneda;

public class Pedido {
    private int id_pedido;
    private Usuario usuario;
    private List<Producto> productos;
    private double total;

    public Pedido(int id_pedido, Usuario usuario) {
        this.id_pedido = id_pedido;
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
        return "Pedido #" + id_pedido + " a nombre de " + usuario.getNombre() + " - Total: $" + FormatoMoneda.formatearCLP(total);
    }
}
