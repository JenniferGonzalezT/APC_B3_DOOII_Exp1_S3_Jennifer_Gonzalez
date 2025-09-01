package tiendaropaonline.modelo.descuentos;

/**
 * Interfaz Component con métodos comunes para los componentes (productos)
 * usando patrón de diseño Decorator.
 */

public interface Component {
    int getID();
    String getNombre();
    String getCategoria();
    double getPrecio();
    String getDescripcion();
}
