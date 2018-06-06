/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppCreditos.controller;

import co.com.poli.AppCreditos.Business.implementation.CreditoBusinessImpl;
import co.com.poli.AppCreditos.model.Credito;
import co.com.poli.AppCreditos.model.Tblcreditos;
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
 * @author FABER
 */
public class ServletUsuario extends HttpServlet {

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
        CreditoBusinessImpl cBusinessImpl = new CreditoBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                Boolean mensaje = false;
                Boolean sw = false;
                String numCredito = request.getParameter("txtnumcredito");
                String documento = request.getParameter("txtdocumento");
                String nombres = request.getParameter("txtnombre");
                Double monto = Double.valueOf(request.getParameter("txtmonto"));
                String tipoTrabajador = request.getParameter("txttitrabajador");
                String tipoCredito = request.getParameter("txtticredito");
                String trabajo = request.getParameter("txttrabaja");

                Tblcreditos credito = new Tblcreditos(numCredito, documento, nombres, monto, tipoTrabajador, tipoCredito, trabajo);
                mensaje = cBusinessImpl.crearCredito(credito);
                if (mensaje == true) {
                    String mensaje2 = "Credito ya existe";
                    session.setAttribute("MENSAJE", mensaje2);
                    rd = request.getRequestDispatcher("mensaje.jsp");
                } else {
                    sw = cBusinessImpl.creditoExiste(documento, tipoCredito);
                    if (sw) {
                        String mensaje25 = "Hola,"+nombres+ " solo puedes realizar un credito para "+tipoCredito;
                        session.setAttribute("MENSAJE", mensaje25);
                        rd = request.getRequestDispatcher("mensaje.jsp");
                    } else {
                        List<Tblcreditos> listaCredito = cBusinessImpl.obtenerListaCreditos();
                        session.setAttribute("LISTADO", listaCredito);
                        rd = request.getRequestDispatcher("/view/creditoslista.jsp");
                    }

                }

                break;
            case "listar":
                List<Tblcreditos> listaCreditos = cBusinessImpl.obtenerListaCreditos();
                session.setAttribute("LISTADO", listaCreditos);
                rd = request.getRequestDispatcher("/view/creditoslista.jsp");
                break;
            case "masUtiliza":
                String mensaje3 = "";
                mensaje3 = cBusinessImpl.masUtiliza();
                session.setAttribute("MENSAJE", mensaje3);
                rd = request.getRequestDispatcher("mensaje.jsp");
                break;
            case "creditoAcumulado":
                String mensaje4 = "";
                mensaje4 = cBusinessImpl.acumulado();
                session.setAttribute("MENSAJE", mensaje4);
                rd = request.getRequestDispatcher("mensaje.jsp");
                break;
            case "prestaMas":
                String mensaje5 = "";
                mensaje5 = cBusinessImpl.masPresta();
                session.setAttribute("MENSAJE", mensaje5);
                rd = request.getRequestDispatcher("mensaje.jsp");
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
