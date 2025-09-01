package tiendaropaonline.util;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Clase para darle el formato de pesos chilenos a la moneda.
 */

public class FormatoMoneda {
    private static final Locale LOCALE_CL = Locale.forLanguageTag("es-CL");
    private static final NumberFormat CLP = NumberFormat.getCurrencyInstance(LOCALE_CL);
    
    private FormatoMoneda() {}
    
    // Método para dar el formato de pesos chilenos
    public static String formatearCLP(double valor) {
        return CLP.format(valor);
    }
}
