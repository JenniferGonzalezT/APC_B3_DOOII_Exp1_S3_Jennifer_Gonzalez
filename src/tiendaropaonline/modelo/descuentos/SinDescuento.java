package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto que no aplica descuento.
 */

public class SinDescuento extends Decorator {
    public SinDescuento(Component componente) {
        super(componente);
    }
    
    @Override
    public int getID() {
        return super.getID();
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
