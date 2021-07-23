<%-- 
    Document   : vistaCliente
    Created on : 22 jul 2021, 3:27:46
    Author     : Artist
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.cliente"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page import="consultas.consultaCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
    </head>
    <body>
        <h1>Cliente</h1>
      
        <div> 
            <table class="default" border="1">
                <thead>
                    <tr>
                    <th scope="row">Nombre</th>
                    <th scope="row">Nit</th>
                    <th scope="row">Telefono</th>
                    <th scope="row">CreditoCompra</th>
                    <th scope="row">DPI</th>
                    <th scope="row">Correo Electronico</th>
                    <th scope="row">Direccion</th>
                </tr>
                    
                </thead>
                
                <%
                consultaCliente consultaCliente = new consultaCliente();    
                List<cliente> arrayList = consultaCliente.ListarDatos();
             System.out.println("arr "+arrayList.size());
                       for (cliente object : arrayList) {
           
                %>
                <tbody>
                    
                    <tr>
               <td><%= object.getNombre() %></td>
                <td><%= object.getNit()%></td>
               <td><%= object.getTelefono()%></td>
               <td><%= object.getCreditoCompra()%></td>
               <td><%= object.getDpi()%></td>
                <td><%= object.getCorreoElectronico()%></td>
               <td><%= object.getDireccion()%></td>
               
              <td><a href="clienteControlador?opcion=modificar">Modificar</a>
                  <a href="clienteControlador?opcion=eliminar">Eliminar</a></td>
                </tr>
                <% } %>
                
                
                </tbody>
            </table>
        </div>
    </body>
</html>
