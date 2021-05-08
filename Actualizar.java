
package registro_estudiantes;

 import java.sql.SQLException;
    import java.util.Scanner;
    

public class Actualizar {
    Actualizar() throws SQLException {
        Scanner leer =new Scanner(System.in);
        Estudiante student = new Estudiante();
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ACTUALIZAR REGISTROS>>");
        
        System.out.println("Ingresar Id del registro a modificar");
        student.setId_estudiante(leer.nextInt());
        
  
        String tablaBuscar = "tb_registro_estudiante";
        String camposBuscar = "nom_estudiante, ape_estudiante, edad_estudiante, carnet_estudiante ";
        String condicionBuscar = "id_estudiante = " + student.getId_estudiante();
        utilerias.desplegarRegistros(tablaBuscar, camposBuscar, condicionBuscar);
        
        System.out.println("Nombre: ");
         student.setNom_estudiante(leer.next());
        
        System.out.println("Apellido del Estudiante");
         student.setApe_estudiante(leer.next());
        
        System.out.println("Edad del Estudiante");
         student.setEdad_estudiante(leer.nextInt());
        
        System.out.println("Carnet del Estudiante");
         student.setCarnet_estudiante(leer.next());
        
        String tabla = "tb_registro_estudiante";
        String camposValoresNuevos = "nom_estudiante = '" +  student.getNom_estudiante() + "', ape_estudiante = '"
                +  student.getApe_estudiante() + "', edad_estudiante = '" +  student.getEdad_estudiante() + "', carnet_estudiante ='"
                +  student.getCarnet_estudiante() + "'";
        
        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("Modificado Corectamente!");
        
        Menu_Principal.desplegarMenu();
     
     // la clase permite actualizar la base de datos de MySQL através de NetBeans
        
    
    }
}
