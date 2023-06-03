
package pisos.util;

import java.util.Date;

/**
 *
 * @author PAKEATING
 */
public class Arrendatario extends Persona{
    
    private Date fechaInicio;
    private Date fechaFin;   

    
    
    
    
    
    
    //getters y setters
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
