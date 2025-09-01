package tiendaropaonline.modelo.descuentos;

/**
 * Clase decorador abstracta que es la base para los decoradores.
 */

public abstract class Decorator implements Component {
    protected Component producto;

    public Decorator(Component componente) {
        this.producto = componente;
    }
    
    @Override
    public int getIdProducto() {
        return producto.getIdProducto();
    }
    
    @Override
    public String getNombre() {
        return producto.getNombre();
    }
    
    @Override
    public String getCategoria() {
        return producto.getCategoria();
    }
    
    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return producto.getDescripcion();
    }
}
