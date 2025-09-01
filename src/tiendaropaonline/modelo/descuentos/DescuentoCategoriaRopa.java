package tiendaropaonline.modelo.descuentos;

/**
 * Decorador concreto para aplicar un 20% de descuento a la categoría Ropa.
 */

public class DescuentoCategoriaRopa extends Decorator {
    public DescuentoCategoriaRopa(Component producto) {
        super(producto);
    }
    
    @Override
    public int getId() {
        return super.getId();
    }
    
    @Override
    public double getPrecio() {
        if (producto.getCategoria().equalsIgnoreCase("Ropa")) {
            return super.getPrecio() * 0.8;
        }
        return super.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " (Con Descuento 20% por categoría Ropa)";
    }
}
