
package gestionalquileres;
import interaccionDB.*;
import pisos.*;
import java.util.*;
import java.sql.Connection;
/**
 *Autor: Francisco Linares Santamaria
 */
public class GestionAlquileres {

    
    public static void main(String[] args) {
        
      ConexionDB conectando=new ConexionDB();  
      Connection miConexion=null;
      String decision="S";
      int menu=0;
      while (menu !=10){
        System.out.println("Introduzca un numero para realizar una accion:");
        String opciones[]={"0: Conectar a la base de datos.","1: Añadir un inmueble.","2: Listar inmuebles guardados.","3: Modificar un inmueble.","4: Consultar un inmueble.","5: Eliminar un inmueble.","10: Salir."};
        for(String opcion : opciones){
            System.out.println(opcion);
        }
        Scanner entrada= new Scanner(System.in);
        menu=entrada.nextInt();
        entrada.nextLine();
        switch(menu){
            case 0:
                
                do{
                if((miConexion==null)|decision.equals("S")|decision.equals("s")){
                    System.out.println("Conectando a la base de datos");
                    System.out.println("Introduzca el nombre de usuario de la base de datos");
                    String usuario=entrada.nextLine();
                    System.out.println("Introduzca la contraseña de la base de datos");
                    String pass=entrada.nextLine();
                    miConexion=conectando.conectar(usuario, pass);
                    decision="N";
                    if(miConexion==null){
                        System.out.println("No se ha podido conectar, revise Usuario y Contraseña");
                        
                    }
                    else{
                        
                        System.out.println("Conectado a la base de datos");
                    }
                    }
                else{System.out.println("Ya hay una conexion activa, ¿desea cambiarla? S/N");
                
                decision=entrada.nextLine();
                                
                }}while(decision.equals("S")|decision.equals("s"));
                
                 
                
                
                
                break;
                
            case 1:
                System.out.println("añadir inmueble");
                break;
                
            case 2:
                System.out.println("listar inmuebles");
                break;
                
            case 3:
                System.out.println("modificar iunmuele");
                break;
                
            case 4:
                System.out.println("consultar inmueble");
                break;
                
            case 5:
                System.out.println("eliminar inmueble");
                break;
            case 10:
                System.out.println("Saliendo");
                break;
                
            default:
                System.out.println("La opcion elegida no es correcta, elija uno de los lsitados arriba");
        }
        }
        
        
    }
public boolean annadirInmueble(){
    return true;
}
public void listarInmuebles(){
    
}
public boolean modificarInmueble(){
    return true;
}
    
}
