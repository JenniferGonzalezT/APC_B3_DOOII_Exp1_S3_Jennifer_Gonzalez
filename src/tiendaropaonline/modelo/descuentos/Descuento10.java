package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto para aplicar un 10% de descuento general.
 */

public class Descuento10 extends Decorator {
    public Descuento10(Component componente) {
        super(componente);
    }
    
    @Override
    public int getID() {
        return super.getID();
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
