<%-- 
    Document   : crearProducto
    Created on : 21 may 2021, 19:11:08
    Author     : Artist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Producto</title>
    </head>
    <body>
        <h1>Crear Producto</h1>

        <form action="productoControlador" method="post">

            <table class="default" border="1">

                <tr>

                    <th scope="row">Datos</th>

                </tr>

                <tr>

                    <td>Nombre:</td>
                    <td><input type="text" name="nombre"></td>

                </tr>
                 <tr>

                    <td>ID:</td>
                    <td><input type="text" name="id"></td>

                </tr>
                  <tr>

                    <td>Precio:</td>
                    <td><input type="text" name="id"></td>

                </tr>



            </table>

        </form>
    </body>
</html>
