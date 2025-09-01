package tiendaropaonline.controlador;

import tiendaropaonline.modelo.Pedido;
import tiendaropaonline.vista.VistaPedido;

public class ControladorPedido {
    private final Pedido pedido;
    private final VistaPedido vista;

    public ControladorPedido(Pedido pedido, VistaPedido vista) {
        this.pedido = pedido;
        this.vista = vista;
    }
    
    public void actualizarVista() {
        vista.mostrarPedido(pedido);
    }
}
