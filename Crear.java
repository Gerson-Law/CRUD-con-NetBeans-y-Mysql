package registro_estudiantes;

import java.sql.SQLException;
import java.util.Scanner;

public class Crear {

Crear() throws SQLException {
  Scanner leer = new Scanner(System.in);
  Estudiante student = new Estudiante();
  System.out.println("<<CREAR RESGISTRO DE ESTUDIANTE>>");
  
  System.out.println("Nombre: ");
  student.setNom_estudiante(leer.nextLine());
  
  System.out.println("Apellidos: ");
  student.setApe_estudiante(leer.nextLine());
  
  System.out.println("Numero de carnet: ");
  student.setCarnet_estudiante(leer.nextLine());
  
  System.out.println("Edad: ");
  student.setEdad_estudiante(leer.nextInt());
  
  String tabla = "tb_registro_estudiante";
  String camposTabla = "nom_estudiante, ape_estudiante, carnet_estudiante, edad_estudiante";
  String valorCampos = "'" + student.getNom_estudiante() + "','" + student.getApe_estudiante() + "','" +
   student.getCarnet_estudiante()+ "','" + student.getEdad_estudiante()+ "'";       
  
  ConexionCRUD utilerias = new ConexionCRUD();
  
  utilerias.guardarRegistros(tabla, camposTabla, valorCampos);
  
  Menu_Principal.desplegarMenu();//llama el método del menú principal
  
  //crea registro
  
    }
    
}
