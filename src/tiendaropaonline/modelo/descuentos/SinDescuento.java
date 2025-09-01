package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto que no aplica descuento.
 */

public class SinDescuento extends Decorator {
    public SinDescuento(Component producto) {
        super(producto);
    }
    
    @Override
    public int getId() {
        return super.getId();
    }
    
    @Override
    public double getPrecio() {
        return super.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " (Sin Descuento)";
    }
}
