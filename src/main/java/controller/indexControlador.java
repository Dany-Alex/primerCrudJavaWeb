/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import consultas.consultaCliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.cliente;

/**
 *
 * @author Artist
 */
@WebServlet(name = "indexControlador", urlPatterns = {"/indexControlador"})
public class indexControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet indexControlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet indexControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    String cliente = "/viewProducto/vistaCliente.jsp",
            empleado = "/viewProducto/vistaEmpleado.jsp";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opcion = request.getParameter("opcion");
        String urlAcceso = "";
        List<cliente> arrayList = null;
        RequestDispatcher requestDispatcher = null;

        if (opcion == null || opcion.isEmpty()) {
            requestDispatcher = request.getRequestDispatcher(cliente);
            consultaCliente consultaCliente = new consultaCliente();
            arrayList = consultaCliente.ListarDatos();
            request.setAttribute("listarCliente", arrayList);
        } else {
            switch (opcion) {

                case "cliente":
                    urlAcceso = cliente;
                    break;
                case "empleado":
                    System.out.println("opcion empleado");
                    urlAcceso = empleado;
                    break;
                default:

            }
            requestDispatcher = request.getRequestDispatcher(urlAcceso);
        }

        requestDispatcher.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
