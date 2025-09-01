package tiendaropaonline.controlador;

import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.carrito.Command;
import tiendaropaonline.vista.VistaCarrito;

public class ControladorCarrito {
    private Carrito carrito;
    private VistaCarrito vista;

    public ControladorCarrito(Carrito carrito, VistaCarrito vista) {
        this.carrito = carrito;
        this.vista = vista;
    }
    
    public void ejecutarComando(Command comando) {
        comando.ejecutar();
    }
    
    public void actualizarVista() {
        vista.mostrarCarrito(carrito);
    }
}
