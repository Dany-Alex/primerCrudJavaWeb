/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexiones.conexion;
import java.sql.Connection;
import java.sql.*;
import java.util.List;
import model.producto;

/**
 *
 * @author Artist
 */
public class productoDAO {

    private Connection connection = null;

    private PreparedStatement preparedStatement;

    private boolean estadoOperacion;
    //obtener conexion pool

    private Connection obtenerConexion() throws SQLException {
        return conexion.getConnection();
    }

    public boolean guardar(producto producto) throws SQLException {
        String sqlQuery = null;
        estadoOperacion = false;
        connection = obtenerConexion();
        try {
            connection.setAutoCommit(false);
            sqlQuery = "INSERT INT productos (id, nombre, cantidad, precio, fecha_crear,fecha_actulizar) VALUES(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, null);
            preparedStatement.setString(2, producto.getNombre());
            preparedStatement.setDouble(3, producto.getCantidad());
            preparedStatement.setDouble(4, producto.getPrecio());
            preparedStatement.setDate(5, producto.getFechaCreacion());
            preparedStatement.setDate(6, producto.getFechaActualizacion());

            estadoOperacion = preparedStatement.executeUpdate() > 0;

            connection.commit();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        }

        return estadoOperacion;
    }

    public boolean editar(producto producto) {
        return true;
    }

    public boolean eliminar(int idProducto) {
        return true;
    }

    public producto getProducto(int idProducto) {
        return null;
    }

    public List<producto> getProductos() {
        return null;
    }
}
