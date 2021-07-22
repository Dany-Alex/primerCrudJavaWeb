/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class conexion {

    private static BasicDataSource dataSource = null;

    // Librería de MySQL
    final private static String driver = "com.mysql.jc.jdbc.Driver";

    // Nombre de la base de datos
    private static String database = "crud_productos";

    // Host
    private static String hostname = "localhost";

    // Puerto
    private static String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    // private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;

    // Nombre de usuario
    private static String username = "root";

    // Clave de usuario
    private static String password = "#T00r123456789";

    private static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(driver);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setUrl(url);
            dataSource.setInitialSize(20);
            dataSource.setMaxIdle(15);
            dataSource.setMaxTotal(20);
            dataSource.setMaxWaitMillis(5000);

        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
