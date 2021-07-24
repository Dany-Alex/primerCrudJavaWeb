<%-- 
    Document   : vistaCrearCliente
    Created on : 23 jul 2021, 11:08:19
    Author     : Artist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <table>
            <tr>
                <th>Cliente</th>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="Nombre"></td>
            </tr>
            <tr>
                <td>Nit</td>
                <td><input type="text" name="Nit"></td>
            </tr>
            <tr>
                <td>Telefono</td>
                <td><input type="text" name="Telefono"></td>
            </tr>
            <tr>
                <td>Credito Compra</td>
                <td><input type="text" name="CreditoCompra"></td>
            </tr>
        <tr>
            <td>DPI</td>
            <td><input type="text" name="DPI"></td>
        </tr>
        <tr>
            <td>Correo Electronico</td>
            <td><input type="text" name="CorreoElectronico"></td>
        </tr>
        <tr>
            <td>Direccion</td>
            <td><input type="text" name="Direccion"></td>
        </tr>
        <tr>
            <td></td>
            <td><a href="clienteControlador?opcion=nuevo">Crear</a></td>
        </tr>
    </table>

    
</body>
</html>
