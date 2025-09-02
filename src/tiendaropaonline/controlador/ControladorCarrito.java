package tiendaropaonline.controlador;

import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.carrito.Command;
import tiendaropaonline.vista.VistaCarrito;

public class ControladorCarrito {
    private Carrito carrito;
    private final VistaCarrito vista;

    public ControladorCarrito(Carrito carrito, VistaCarrito vista) {
        this.carrito = carrito;
        this.vista = vista;
    }

    public void setCarrito() {
        this.carrito = new Carrito();
    }
    
    public void ejecutarComando(Command comando) {
        comando.ejecutar();
    }
    
    public void actualizarVista() {
        vista.mostrarCarrito(carrito);
    }
}
