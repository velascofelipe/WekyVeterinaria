package Conexion;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author pipe_
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion() {
        try {
            Properties propiedades = new Properties();
            InputStream entrada = Conexion.class.getClassLoader().getResourceAsStream("config.properties");
            propiedades.load(entrada);

            String url = propiedades.getProperty("db.url");
            String usuario = propiedades.getProperty("db.user");
            String contraseña = propiedades.getProperty("db.password");

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, usuario, contraseña);
            return con;
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}