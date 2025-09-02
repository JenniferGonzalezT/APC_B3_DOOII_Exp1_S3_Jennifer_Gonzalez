package tiendaropaonline.modelo;

import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.util.FormatoMoneda;

public class Pedido {
    private static int generadorId = 0;
    
    private final int idPedido;
    private final Usuario usuario;
    private final Carrito carrito;

    public Pedido(Usuario usuario, Carrito carrito) {
        this.idPedido = ++generadorId;
        this.usuario = usuario;
        this.carrito = carrito;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Carrito getCarrito() {
        return carrito;
    }
    
    public double getTotal() {
        return carrito.calcularTotal();
    }

    @Override
    public String toString() {
        return "Pedido #" + idPedido + " a nombre de " + usuario.getNombre() + " - Total: " + FormatoMoneda.CLP(getTotal());
    }
}
