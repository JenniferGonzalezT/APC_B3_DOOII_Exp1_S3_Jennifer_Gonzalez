package tiendaropaonline.app_main;

import java.util.ArrayList;
import java.util.List;
import tiendaropaonline.modelo.Producto;
import tiendaropaonline.modelo.Usuario;
import tiendaropaonline.modelo.descuentos.Component;
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
        // Usuario de prueba
        Usuario user1 = new Usuario(1,"Ana","ana@email.com");
        
        // Productos de prueba
        List<Component> productos = new ArrayList<>();
        productos.add(new Producto(1, "Polera", 15000, "Ropa"));
        productos.add(new Producto(2,"Jeans", 25000, "Ropa"));
        productos.add(new Producto(3,"Zapatos", 30000, "Calzado"));
        productos.add(new Producto(4,"Gorro", 7000, "Accesorios"));
        
        // Inicializacion del sistema con la vista de consola
        VistaConsola vistaConsola = new VistaConsola(user1, productos);
        vistaConsola.saludo();
        vistaConsola.opcionMenu();
    }
    
}
