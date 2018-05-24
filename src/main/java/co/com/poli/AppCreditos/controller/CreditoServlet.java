/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.controller;

import co.com.poli.AppCreditos.Business.implementation.CreditoBusinessImpl;
import co.com.poli.AppCreditos.data.CreditoData;
import co.com.poli.AppCreditos.model.Credito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author giovanny
 */
public class CreditoServlet extends HttpServlet {

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

        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CreditoBusinessImpl uBusinessImpl = new CreditoBusinessImpl();
        String accion = request.getParameter("accion");
        Double numcredito = request.getParameter("txtnumcredito");
        
        
        switch (accion) {
            case "crear":
                
                String nombres = request.getParameter("txtnombres");
                String apellidos = request.getParameter("txtapellidos");
                String email = request.getParameter("txtemail");
                String clave = request.getParameter("txtclave");
                Boolean estado = Boolean.valueOf(request.getParameter("txtestado"));
                String rol = request.getParameter("txtrol");
                Credito usuario = new Credito(documento, nombres, apellidos, email, clave, rol, estado);

                String mensaje = uBusinessImpl.crearUsuario(usuario);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "eliminar":
                String documen = request.getParameter("txtdocumento");
            
                uBusinessImpl.eliminarUsuario(documen);
                
                List<Credito> listaUsuarios2 = uBusinessImpl.obtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios2);
                rd = request.getRequestDispatcher("/view/usuarioslista.jsp");
                
                

                break;
            case "actualizar":
                
                session.setAttribute("documento", documento);
                rd = request.getRequestDispatcher("/view/usuarioUpdate.jsp");
                
                break;
                
            case "save":
                
                nombres = request.getParameter("txtnombres");
                apellidos = request.getParameter("txtapellidos");
                email = request.getParameter("txtemail");
                clave = request.getParameter("txtclave");
                estado = Boolean.valueOf(request.getParameter("txtestado"));
                rol = request.getParameter("txtrol");
                usuario = new Credito(documento, nombres, apellidos, email, clave, rol, estado);

                mensaje = uBusinessImpl.modificarUsuario(usuario);                
                
                session.setAttribute("documento", documento);
                rd = request.getRequestDispatcher("/view/usuarioslista.jsp");
                
                
                break;
            case "listar":
                List<Credito> listaUsuarios = uBusinessImpl.obtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios);
                rd = request.getRequestDispatcher("/view/usuarioslista.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);

    }

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
        processRequest(request, response);
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
