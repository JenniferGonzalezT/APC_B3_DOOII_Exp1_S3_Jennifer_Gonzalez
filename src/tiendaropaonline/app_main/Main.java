package tiendaropaonline.app_main;

import java.util.ArrayList;
import java.util.List;
import tiendaropaonline.controlador.ControladorCarrito;
import tiendaropaonline.modelo.Producto;
import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.descuentos.Component;
import tiendaropaonline.modelo.descuentos.ProductoBase;
import tiendaropaonline.vista.VistaCarrito;
import tiendaropaonline.vista.VistaConsola;

/**
 * Proyecto para gestionar una tienda de ropa online usando patrones de diseño 
 * creacionales (Singleton), estructurales (Decorator) y de comportamiento
 * (Command), además de patrones de arquitectura (MVC).
 * 
 * @author Jennifer
 */

public class Main {

    public static void main(String[] args) {
        // Usuarios de prueba
        
        
        // Productos de prueba
        List<Component> productos = new ArrayList<>();
        productos.add(new ProductoBase(new Producto(1, "Polera", 15000, "Ropa")));
        productos.add(new ProductoBase(new Producto(2,"Jeans", 25000, "Ropa")));
        productos.add(new ProductoBase(new Producto(3,"Zapatos", 30000, "Calzado")));
        
        // Carrito
        Carrito carrito = new Carrito();
        VistaCarrito vistaCarrito = new VistaCarrito();
        ControladorCarrito controladorCarrito = new ControladorCarrito(carrito, vistaCarrito);
        
        // Menú
        VistaConsola vistaConsola = new VistaConsola(productos, carrito, controladorCarrito, vistaCarrito);
        vistaConsola.saludo();
        vistaConsola.opcionMenu();
        
    }
    
}
