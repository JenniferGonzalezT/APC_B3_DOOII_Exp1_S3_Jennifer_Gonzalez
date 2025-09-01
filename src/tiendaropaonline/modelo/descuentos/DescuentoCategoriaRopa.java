package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto para aplicar un 20% de descuento a la categoría Ropa.
 */

public class DescuentoCategoriaRopa extends Decorator {
    public DescuentoCategoriaRopa(Component componente) {
        super(componente);
    }
    
    @Override
    public int getID() {
        return super.getID();
    }
    
    @Override
    public double getPrecio() {
        if (componente.getCategoria().equalsIgnoreCase("Ropa")) {
            return super.getPrecio() * 0.8;
        }
        return super.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " (Con Descuento 20% por categoría Ropa)";
    }
}
