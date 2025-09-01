package tiendaropaonline.controlador;

import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.vista.VistaDescuento;

public class ControladorDescuento {
    private Component producto;
    private VistaDescuento vista;

    public ControladorDescuento(Component producto, VistaDescuento vista) {
        this.producto = producto;
        this.vista = vista;
    }
    
    public void actualizarVista() {
        vista.mostrarPrecioConDescuento(producto);
    }
}
