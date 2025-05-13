import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Conexion {
    private Connection con;

    public Conexion() throws FileNotFoundException, SQLException, IOException {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("properties.txt")) {
            prop.load(fis);

            con = DriverManager.getConnection(prop.getProperty("DRIVER") + prop.getProperty("BBDD"),
                    prop.getProperty("USER"),
                    prop.getProperty("PASS"));
        }
    }

    public void close() throws SQLException {
        if(con != null) {
            con.close();
        } else {
            throw new SQLException("No open connection");
        }
    }

    public ArrayList<Supermercado> getSupermercados() throws SQLException {
        ArrayList<Supermercado> lista = new ArrayList<>();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM supermercados");

        while (rs.next()) {
            lista.add(new Supermercado(rs.getString("cod_sede"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("ciudad"),
                    rs.getString("telefono"),
                    rs.getInt("metros_cuadrados"),
                    rs.getInt("num_cajas"),
                    rs.getString("tiene_parking").equalsIgnoreCase("SI"),
                    rs.getString("tiene_carniceria").equalsIgnoreCase("SI")));
        }
        return lista;
    }

    public ArrayList<Empleado> getEmpleados(Supermercado supermercado) throws SQLException {
        ArrayList<Empleado> lista = new ArrayList<>();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM empleados WHERE cod_sede = '" + supermercado.getCodSede() + "'");
        while (rs.next()) {
            lista.add(new Empleado(rs.getString("dni"),
                    rs.getString("cod_sede"),
                    rs.getString("nombre"),
                    rs.getString("categoria"),
                    rs.getString("turno"),
                    rs.getDate("fecha_contrato").toLocalDate(),
                    rs.getDouble("salario")));
        }

        return lista;
    }

    public ArrayList<Supermercado> getSupermercadosCiudad(String ciudad) throws SQLException {
        ArrayList<Supermercado> lista = new ArrayList<>();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM supermercados WHERE ciudad = '" + ciudad + "'");

        while (rs.next()) {
            lista.add(new Supermercado(rs.getString("cod_sede"),
                    rs.getString("nombre"),
                    rs.getString("direccion"),
                    rs.getString("ciudad"),
                    rs.getString("telefono"),
                    rs.getInt("metros_cuadrados"),
                    rs.getInt("num_cajas"),
                    rs.getString("tiene_parking").equalsIgnoreCase("SI"),
                    rs.getString("tiene_carniceria").equalsIgnoreCase("SI")));
        }
        return lista;
    }
}
