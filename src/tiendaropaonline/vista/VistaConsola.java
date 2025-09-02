package tiendaropaonline.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tiendaropaonline.controlador.*;
import tiendaropaonline.modelo.Pedido;
import tiendaropaonline.modelo.Usuario;
import tiendaropaonline.modelo.carrito.*;
import tiendaropaonline.modelo.descuentos.*;

public class VistaConsola {
    private final Scanner scanner;
    private Carrito carrito;
    private final VistaCarrito vistaCarrito;
    private final ControladorCarrito controladorCarrito;
    private final Usuario usuario;
    private final List<Component> productos;

    public VistaConsola(Usuario usuario, List<Component> productos) {
        this.scanner = new Scanner(System.in);
        this.carrito = new Carrito();
        this.vistaCarrito = new VistaCarrito();
        this.controladorCarrito = new ControladorCarrito(carrito, vistaCarrito);
        this.usuario = usuario;
        this.productos = new ArrayList<>(productos);
    }
    
    public void saludo() {
        System.out.println("¡Bienvenid@ a la tienda de ropa online!");
    }
    
    public int mostrarMenu() {
        System.out.println("\n===================== MENÚ ====================");
        System.out.println("(1) Mostrar productos");
        System.out.println("(2) Agregar producto al carrito");
        System.out.println("(3) Eliminar producto del carrito");
        System.out.println("(4) Ver carrito");
        System.out.println("(5) Confirmar pedido");
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
                    System.out.println("\n==================== SALIR ====================");
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
                    verCarrito();
                    break;
                case 5:
                    confirmarPedido();
            }
        } while (opcion != 0);
    }
    
    private void mostrarProductos() {
        System.out.println("\n================== PRODUCTOS ==================");
        for (Component producto : productos) {
            System.out.println(producto.getDescripcion());
        }
    }
    
    private Component seleccionarProducto(List<Component> lista) {
        while (true) {
            System.out.print("Ingrese el ID del producto: ");
            try {
                String entrada = scanner.nextLine().trim();
                int id = Integer.parseInt(entrada);
                for (Component producto : lista) {
                    if (id == producto.getIdProducto()) {
                        return producto;
                    }
                }
                return null;
            } catch (NumberFormatException e) {
                System.out.println("La entrada ingresada no es válida.");
            }
        }
    }
    
    private void agregarProducto() {
        System.out.println("\n========= AGREGAR PRODUCTO AL CARRITO =========");
        Component producto = seleccionarProducto(productos);
        if (producto != null) {
            producto = DiscountManager.getInstance().aplicarDescuento10(producto);
            producto = DiscountManager.getInstance().aplicarDescuentoCategoriaRopa(producto);
            
            controladorCarrito.ejecutarComando(new AgregarProducto(carrito, producto));
            System.out.println("Producto agregado al carrito: " + producto.getDescripcion());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    private void eliminarProducto() {
        System.out.println("\n======== ELIMINAR PRODUCTO DEL CARRITO ========");
        if (carrito.listarProductos().isEmpty()) {
            System.out.println("Aún no tiene productos en el carrito.");
            return;
        }
        
        Component producto = seleccionarProducto(carrito.listarProductos());
        if (producto != null) {
            controladorCarrito.ejecutarComando(new EliminarProducto(carrito, producto));
            System.out.println("Producto eliminado del carrito: " + producto.getDescripcion());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    private void verCarrito() {
        controladorCarrito.actualizarVista();
    }
    
    private void confirmarPedido() {
        Pedido pedido = new Pedido(usuario, carrito);
        ControladorPedido controlador = new ControladorPedido(pedido, new VistaPedido());
        controlador.actualizarVista();
        
        // Limpieza del carrito
        controladorCarrito.setCarrito(new Carrito());
    }
}
