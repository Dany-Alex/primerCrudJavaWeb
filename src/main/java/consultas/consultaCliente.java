/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import conexiones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.cliente;

/**
 *
 * @author Artist
 */
public class consultaCliente {

    conexion conexion = new conexion();

    private Connection connection;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String nombreTabla = "cliente";

    public List ListarDatos() {
        ArrayList<cliente> arrayList = new ArrayList<cliente>();
        try {
            connection = conexion.getConnection();
            String query = "SELECT * FROM " + nombreTabla + ";";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                cliente cliente = new cliente();

                cliente.setNombre(resultSet.getString(1));
                cliente.setNit(resultSet.getString(2));
                cliente.setTelefono(resultSet.getInt(3));
                cliente.setCreditoCompra(resultSet.getInt(4));
                cliente.setDpi(resultSet.getInt(5));
                cliente.setCorreoElectronico(resultSet.getString(6));
                cliente.setDireccion(resultSet.getString(7));

                System.out.println(resultSet.getString(1));
                System.out.println("consulta lista size - " + arrayList.size());
                arrayList.add(cliente);
            }
        } catch (Exception e) {
            //System.err.print("Ha ocurrido un error: " + e.getMessage());
            System.out.println("consulta " + nombreTabla + " dice: Ha ocurrido un error: " + e.getMessage());
        } finally {

        }
        return arrayList;

    }

}
