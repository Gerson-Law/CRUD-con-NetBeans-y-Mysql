package registro_estudiantes;
import java.sql.SQLException;

public class Leer {
    public Leer() throws SQLException {
        System.out.println("<< Consultar Registro de Estudiantes >>");
        mostrarResultados();
    }
    
    private void mostrarResultados() throws SQLException {
    try{
    ConexionCRUD utilerias = new ConexionCRUD();
    String tabla = "tb_registro_estudiante";
    String camposTabla = "*";
    String condicionBusqueda = "";
    utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
    } catch (SQLException ex){
        System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
    }finally{
    Menu_Principal.desplegarMenu();
    }
    }
}
