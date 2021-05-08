
package registro_estudiantes;

import java.sql.SQLException;
import java.util.Scanner;

public class Eliminar {

    
    public static void main(String[] args) {
        
    }
         Eliminar() throws SQLException {
         Scanner leer = new Scanner (System.in);
         ConexionCRUD utilerias = new ConexionCRUD();
         System.out.println("<<ELIMINAR REGISTRO>>");
         
        System.out.println("Ingrese el Id del estudiante: ");
        String idEstudianteEliminar = leer.next();
        
        System.out.println("Ingrese el Carnet del estudiante: ");
        String carnetEstudianteEliminar = leer.next();
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudianteEliminar = leer.next();
        
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellidoEstudianteEliminar = leer.next();
        
        System.out.println("Ingrese la edad del estudiante: ");
        String edadEstudianteEliminar = leer.next();
        
        String tabla= "tb_registro_estudiante";
        String campos= "*";
        String condicion = "id_estudiante = " + idEstudianteEliminar;
        utilerias.desplegarRegistros(tabla, campos, condicion);
        
        System.out.println("presiona <<S>> para confirmar: ");
        String confirmarEliminar = leer.next();
        
        if("S".equals(confirmarEliminar)) {
            
            String ValoresCamposNuevos="";
            //procedimiento para actualizar datos
            utilerias.actualizarEliminarRegistro(tabla, ValoresCamposNuevos, condicion);
            System.out.println("Registro borrado correctamente");
            
        }
         
         
        }
}
    

   
