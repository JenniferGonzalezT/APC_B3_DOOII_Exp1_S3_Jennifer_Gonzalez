package tiendaropaonline.modelo.descuentos;

/**
 * Clase DiscountManager con patrón Singleton responsable de aplicar descuentos.
 */

public class DiscountManager {
    private static DiscountManager instance;
    
    private DiscountManager() {}
    
    public static DiscountManager getInstance() {
        if (instance == null) {
            instance = new DiscountManager();
        }
        return instance;
    }
    
    public Component aplicarDescuento10(Component producto) {
        return new Descuento10(producto);
    }
    
    public Component aplicarDescuentoCategoriaRopa(Component producto) {
        return new DescuentoCategoriaRopa(producto);
    }
    
    public Component sinDescuento(Component producto) {
        return new SinDescuento(producto);
    }
}
