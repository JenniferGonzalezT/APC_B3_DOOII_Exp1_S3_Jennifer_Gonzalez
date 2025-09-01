package tiendaropaonline.modelo.descuentos;

/**
 * Clase decorador abstracta que es la base para los decoradores.
 */

public abstract class Decorator implements Component {
    protected Component componente;

    public Decorator(Component componente) {
        this.componente = componente;
    }
    
    @Override
    public int getID() {
        return componente.getID();
    }
    
    @Override
    public String getNombre() {
        return componente.getNombre();
    }
    
    @Override
    public String getCategoria() {
        return componente.getCategoria();
    }
    
    @Override
    public double getPrecio() {
        return componente.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return componente.getDescripcion();
    }
}
