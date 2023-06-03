
package pisos.util;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Date;
/**
 *Autor: Francisco linares Santamaria
 * Se trata de una clase inmueble genérica de la que posteriormente heredarán los distintos tipos de inmuebles para alquiler
 */
public class InmuebleAlquiler {
    private String nombre;
    private BigDecimal renta;
    private BigDecimal fianza;
    private BigDecimal precioCompra;
    private Reforma reformaInicial;
    private BigDecimal precioMercado;
    private Localizacion direccion;
    private ArrayList <Arrendatario> Arrendatarios;
    private Date fechaCompra=null;
    private Date fechaVenta=null;

    
    
    
    //breve resumen de las características del inmueble
    public String getResumen(){
        String resumen="El inmueble "+nombre+ " se encuentra en la direccion: /n"+direccion.getDireccion()+"/n";
        resumen+="se alquila por un total de "+renta.doubleValue()+" euros al mes./n";
        if(fechaCompra.equals(null))
        {
            resumen+="Fue comprado inicialmente por "+precioCompra.doubleValue()+"/n";
        }else{
            resumen+="Fue comprado inicialmente por "+precioCompra.doubleValue()+" en el año "+fechaCompra.getYear()+"/n";
        }
        resumen+="Podria venderse actualmente por aproximadamente "+ precioMercado.doubleValue()+"/n";
        resumen+="Actualmente es ocupado por: /n"+getDatosArrendatarios();
        if(fechaVenta.equals(null)){
        } else {
            resumen+="Este inmueble fue vendido en el año "+ fechaVenta.getYear();
        }
        return resumen;
    }
    
    
    
    //devuelve un String con nombre, apellidos y DNI de los inquilinos del inmueble
    public String getDatosArrendatarios(){
        String datos="";
        int tamanno=Arrendatarios.size();
        for (int i=0;i<tamanno;i++){
            datos=datos + Arrendatarios.get(i).getDatos()+"/n";
        }
        return datos;
    }
    
    
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getRenta() {
        return renta;
    }

    public void setRenta(BigDecimal renta) {
        this.renta = renta;
    }

    public BigDecimal getFianza() {
        return fianza;
    }

    public void setFianza(BigDecimal fianza) {
        this.fianza = fianza;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Reforma getReformaInicial() {
        return reformaInicial;
    }

    public void setReformaInicial(Reforma reformaInicial) {
        this.reformaInicial = reformaInicial;
    }

    public BigDecimal getPrecioMercado() {
        return precioMercado;
    }

    public void setPrecioMercado(BigDecimal precioMercado) {
        this.precioMercado = precioMercado;
    }

    public Localizacion getDireccion() {
        return direccion;
    }

    public void setDireccion(Localizacion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Arrendatario> getArrendatarios() {
        return Arrendatarios;
    }

    public void setArrendatarios(ArrayList<Arrendatario> Arrendatarios) {
        this.Arrendatarios = Arrendatarios;
    }
    
    
}
