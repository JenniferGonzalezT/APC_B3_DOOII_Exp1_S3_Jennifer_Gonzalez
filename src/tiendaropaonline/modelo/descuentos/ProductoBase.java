package tiendaropaonline.modelo.descuentos;

import tiendaropaonline.modelo.Producto;
import tiendaropaonline.util.FormatoMoneda;

/**
 * Clase concreta base que implementa Component y representa a los productos
 * con su precio normal, sin descuento.
 */

public class ProductoBase implements Component {
    private Producto producto;

    public ProductoBase(Producto producto) {
        this.producto = producto;
    }
    
    @Override
    public int getID() {
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
        return "Producto " + producto.getIdProducto() + ": " + producto.getNombre() + " " + FormatoMoneda.formatearCLP(producto.getPrecio()) + " (" + producto.getCategoria() + ")";
    }
    
    public Producto getProducto() {
        return producto;
    }
    
}
