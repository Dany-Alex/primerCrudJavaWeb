/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class conexion {

    private static BasicDataSource dataSource = null;

    // Librería de MySQL
    //  final private static String driver = "com.mysql.jdbc.Driver";
    final private static String driver = "com.mysql.cj.jdbc.Driver";
    // Nombre de la base de datos
    private static String database = "intelaf";

    // Host
    private static String hostname = "localhost";

    // Puerto
    private static String port = "3306";
    // Puerto
    private static String zonaHoraria = "&serverTimezone=UTC";
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    //private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false" + zonaHoraria;
    // Nombre de usuario
    private static String username = "root";

    // Clave de usuario
    private static String password = "#T00r123456789";

    //Variables
    Connection connection = null;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName(driver);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setUrl(url);
            dataSource.setInitialSize(20);
            dataSource.setMaxIdle(2);
            dataSource.setMaxTotal(20);
            dataSource.setMaxWaitMillis(10000);

        }
        return dataSource;
    }

    public Connection getConnection() throws SQLException {
        connection = getDataSource().getConnection();
        return connection;
    }

}
