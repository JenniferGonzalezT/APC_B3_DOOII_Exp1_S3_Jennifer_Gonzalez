package tiendaropaonline.controlador;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.vista.VistaProducto;

public class ControladorProducto {
    private final Component producto;
    private final VistaProducto vista;

    public ControladorProducto(Component producto, VistaProducto vista) {
        this.producto = producto;
        this.vista = vista;
    }
    
    public void actualizarVista() {
        vista.mostrarProducto(producto);
    }
}
