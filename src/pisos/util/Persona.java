
package pisos.util;

/**
 *
 * @author PAKEATING
 */
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono1;
    private String telefono2;

    public String getDatos(){
        return nombre+" "+apellido1+" "+ apellido2+ " DNI: " +dni;
    }
    public String getNombreyTelefono(){
        return "Teléfonos de: "+nombre+" "+apellido1+" "+telefono1+ " " +telefono2;
    }
    
    
    
    //getters y setters
            
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    
}
