/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

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
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
        int hora = horaDoDia(LocalTime.now());      
        
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        
        if (hora == 0 && lang.equals("pt")) {
            msg = "Bom dia, ";
        }
        else if (hora == 1 && lang.equals("pt")) {
            msg = "Boa tarde, ";
        }
        else if (hora == 2 && lang.equals("pt")) {
            msg = "Boa noite, ";
        }
        
        else if (hora == 0 && lang.equals("en")) {
            msg = "Good morning, ";
        }
        else if (hora == 1 && lang.equals("en")) {
            msg = "Good afternoon, ";
        }
        else if (hora == 2 && lang.equals("en")) {
            msg = "Good night, ";
        }
        
        else if (hora == 0 && lang.equals("de")) {
            msg = "Guten morgen, ";
        }
        else if (hora == 1 && lang.equals("de")) {
            msg = "Guten tag, ";
        }
        else if (hora == 2 && lang.equals("de")) {
            msg = "Guten nacht, ";
        }
        
        else if (hora == 0 && lang.equals("ita")) {
            msg = "Buongiorno, ";
        }
        else if (hora == 1 && lang.equals("ita")) {
            msg = "Buon pomeriggio, ";
        }
        else if (hora == 2 && lang.equals("ita")) {
            msg = "Buona notte, ";
        }
        
        else if (hora == 0 && lang.equals("es")) {
            msg = "Buenos días, ";
        }
        else if (hora == 1 && lang.equals("es")) {
            msg = "Buenas tardes, ";
        }
        else if (hora == 2 && lang.equals("es")) {
            msg = "Buenas noches, ";
        }        
        
        else if (hora == 0 && lang.equals("fr")) {
            msg = "Bonjour, ";
        }
        else if (hora == 1 && lang.equals("fr")) {
            msg = "Bon après-midi, ";
        }
        else if (hora == 2 && lang.equals("fr")) {
            msg = "Bonne nuit, ";
        }
        
        /*switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
            case "ita":
                msg = "Ciao, ";
                break;
            case "es":
                msg = "¡Hola, ";
                break;
        }
        */
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private int horaDoDia(LocalTime hora) {
        LocalTime noite = LocalTime.of(18, 0, 0, 0); 
        if (hora.isBefore(LocalTime.NOON) && hora.isAfter(LocalTime.MIDNIGHT)) {
            return 0;
        }        
        else if (hora.isAfter(LocalTime.NOON) && hora.isBefore(noite)) {
            return 1;
        }
        else {
            return 2;
        }
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
