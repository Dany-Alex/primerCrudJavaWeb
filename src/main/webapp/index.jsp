<%-- 
    Document   : index
    Created on : 18 may 2021, 21:05:08
    Author     : Artist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi CRUD Java Web</title>
    </head>
    <body>
        <h1>Titulo</h1>

        <div> 
            <table class="default" border="1">

                <tr>

                    <th scope="row">Opciones</th>

                </tr>

                <tr>
                
                    <td><a href="productoControlador?opcion=crear">Crear Producto</a></td>
                </tr>
                <tr>

                    <td><a href="productoControlador?opcion=modificar">Modificar Producto</a></td>
                </tr>
                <tr>
                    <td><a href="productoControlador?opcion=eliminar">Eliminar Producto</a></td>
                </tr>
                <tr>
                    <td><a href="productoControlador?opcion=listar">Listar Productos</a></td>

                </tr>



            </table>
        </div>
    </body>
</html>
