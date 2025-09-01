package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto para aplicar un 10% de descuento general.
 */

public class Descuento10 extends Decorator {
    public Descuento10(Component producto) {
        super(producto);
    }
    
    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.9;
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " (Con Descuento 10%)";
    }
}
