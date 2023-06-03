
package pisos.util;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author PAKEATING
 */
public class Obra {
    private String nombre;
    private BigDecimal precio;
    private ArrayList <Material> materiales; //la mano de obra se considera tambien un material
    private ArrayList <Contratista> obreros;
}
