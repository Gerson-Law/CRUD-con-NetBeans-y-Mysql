package registro_estudiantes;
//Gerson alexander
import java.sql.SQLException;
import java.util.Scanner;

public class Menu_Principal {
   public static void main(String[] args) throws SQLException {
          desplegarMenu();
    }
    
    public static void desplegarMenu() throws SQLException {
    Scanner opSeleccionada = new Scanner(System.in);
    String opMenu;
    
        System.out.println("||========================================||");
        System.out.println("||                                        ||");
        System.out.println("||=======> MENU CRUD ESTUDIANTES <========||");
        System.out.println("||                                        ||");
        System.out.println("||========================================||");
        System.out.println("||                                        ||");
        System.out.println("||::::::::::  MENU DE OPCIONES :::::::::::||");
        System.out.println("||  1.Crear Registro de estudiante        ||");
        System.out.println("||  2.Consultar Registros de estudiantes  ||");
        System.out.println("||  3.Actualizar Registro de estudiante   ||");
        System.out.println("||  4.Eliminar Registro de estudiante     ||");
        System.out.println("||  5.Salir                               ||");
        System.out.println("||                                        ||");
        System.out.println("||========================================||");
        System.out.println("||  SELECCIONE EL METODO CRUD A UTLIZAR   ||");
        opMenu = opSeleccionada.next();
        
       /M/ENU D COSNDOMAE
        switch (opMenu) {
            case "1":
                Crear create = new Crear();
                break;
            case "2":
                Leer read = new Leer();
                break;
            case "3":
                Actualizar update = new Actualizar();
                break;
            case "4":
                Eliminar delete = new Eliminar();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("LA OPCION NO EXISTE!!!");
        }
    }   
}

