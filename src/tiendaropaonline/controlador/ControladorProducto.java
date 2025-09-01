package tiendaropaonline.controlador;

import tiendaropaonline.modelo.Producto;
import tiendaropaonline.vista.VistaProducto;

public class ControladorProducto {
    private Producto producto;
    private VistaProducto vista;

    public ControladorProducto(Producto producto, VistaProducto vista) {
        this.producto = producto;
        this.vista = vista;
    }
    
    public void actualizarVista() {
        vista.mostrarProducto(producto);
    }
}
