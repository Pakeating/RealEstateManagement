
package pisos.util;

/**
 *
 * @author PAKEATING
 */
public class Localizacion {
    private String calle;
    private String portal;
    private String altura;
    private String puerta;

    public String getDireccion(){
        return calle + " "+ portal+" "+altura +" "+puerta;
    }
    
    
    //setters y getters
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }
    
    
    
}
