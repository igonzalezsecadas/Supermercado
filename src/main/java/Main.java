import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Conexion con = new Conexion();

            listarEmpleados(con);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo 'properties' no encontrado");
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }
    }

    private static void listarEmpleados(Conexion con) throws SQLException {
        ArrayList<Supermercado> listaSupermercados = con.getSupermercados();

        for (Supermercado s : listaSupermercados) {
            System.out.println("Empleados de " + s.getCodSede() + " " + s.getNombre());
            ArrayList<Empleado> listaEmpleados = con.getEmpleados(s);
            for (Empleado e : listaEmpleados) {
                System.out.println(e);
            }
        }
    }

    private static void buscarSupermercados(Conexion con, String ciudad) throws SQLException {
        ArrayList<Supermercado> listaSupermercados = con.getSupermercadosCiudad(ciudad);

        for (Supermercado s : listaSupermercados) {
            System.out.println(s);
        }
    }
}
