
package tiendaropaonline.vista;

import java.util.List;
import java.util.Scanner;
import tiendaropaonline.controlador.ControladorCarrito;
import tiendaropaonline.modelo.Producto;
import tiendaropaonline.modelo.carrito.AgregarProducto;
import tiendaropaonline.modelo.carrito.Carrito;
import tiendaropaonline.modelo.carrito.EliminarProducto;
import tiendaropaonline.modelo.descuentos.Component;

public class VistaConsola {
    private final Scanner scanner = new Scanner(System.in);
    private List<Component> productos;
    private Carrito carrito;
    private ControladorCarrito controladorCarrito;
    private VistaCarrito vistaCarrito;

    public VistaConsola(List<Component> productos, Carrito carrito, ControladorCarrito controladorCarrito, VistaCarrito vistaCarrito) {
        this.productos = productos;
        this.carrito = carrito;
        this.controladorCarrito = controladorCarrito;
        this.vistaCarrito = vistaCarrito;
    }
    
    public void saludo() {
        System.out.println("¡Bienvenid@ a la tienda de ropa online!");
    }
    
    public int mostrarMenu() {
        System.out.println("\n===== MENÚ =====");
        System.out.println("(1) Ver productos");
        System.out.println("(2) Agregar producto al carrito");
        System.out.println("(3) Eliminar producto del carrito");
        System.out.println("(4) Ver carrito");
        System.out.println("(5) Aplicar descuento");
        System.out.println("(0) Salir");

        final int OPCION_MIN = 0;
        final int OPCION_MAX = 5;
        
        int opcion = 0;
        boolean opcionValida = false;
        String mensajeOpciones = "\nRecuerde ingresar un número de " + OPCION_MIN + " a " + OPCION_MAX;
        
        while (!opcionValida) {
            System.out.print("\nIngrese el número correspondiente a su opción: ");
            try {
                String entrada = scanner.nextLine().trim();
                opcion = Integer.parseInt(entrada);
                if (opcion >= OPCION_MIN && opcion <= OPCION_MAX) {
                    opcionValida = true;
                } else {
                    System.out.println("El número ingresado no es válido." + mensajeOpciones);
                }
            } catch (NumberFormatException e) {
                System.out.println("La entrada no es válida." + mensajeOpciones);
            }
        }
        return opcion;
    }
    
    public void opcionMenu() {
        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 0:
                    System.out.println("\n===== SALIR =====");
                    System.out.println("Saliendo...\n¡Muchas gracias por su visita!");
                    break;
                case 1:
                    mostrarProductos();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    controladorCarrito.actualizarVista();
                    break;
                case 5:
                    aplicarDescuento();
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
    
    private void mostrarProductos() {
        System.out.println("\n===== PRODUCTOS =====");
        for (Component producto : productos) {
            System.out.println(producto.getDescripcion());
        }
    }
    
    private void agregarProducto() {
        System.out.println("\n===== AGREGAR PRODUCTO AL CARRITO =====");
        System.out.print("Ingrese el ID del producto que desea agregar: ");
        try {
            String entrada = scanner.nextLine().trim();
            int id = Integer.parseInt(entrada);
            for (Component producto : productos) {
                if (producto.getID() == id) {
                    controladorCarrito.ejecutarComando(new AgregarProducto(carrito, producto));
                }
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es válida.");
        }
        System.out.println("Producto no encontrado.");
    }
    
    private void eliminarProducto() {
        System.out.println("\n===== ELIMINAR PRODUCTO DEL CARRITO =====");
        System.out.print("Ingrese el ID del producto que desea eliminar: ");
        try {
            String entrada = scanner.nextLine().trim();
            int id = Integer.parseInt(entrada);
            for (Component producto : productos) {
                if (producto.getID() == id) {
                    controladorCarrito.ejecutarComando(new EliminarProducto(carrito, producto));
                }
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es válida.");
        }
        System.out.println("Producto no encontrado.");
    }
    
    private void aplicarDescuento() {
        System.out.println("Descuentoo");
    }
}
