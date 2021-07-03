/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jenniffer
 */
@WebServlet(name = "Descubra", urlPatterns = {"/descubra"})
public class Descubra extends HttpServlet {

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
            out.println("<title>Servlet Descubra</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Descubra at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> oiee </h1>");
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
        
        LocalDate data = LocalDate.parse(request.getParameter("dtNascimento"));
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + adivinheOSigno(data) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private String adivinheOSigno(LocalDate data) {
        
        LocalDate aries = LocalDate.of(data.getYear(),3,21);
        LocalDate touro = LocalDate.of(data.getYear(),4,21);
        LocalDate gemeos = LocalDate.of(data.getYear(),5,21);
        LocalDate cancer = LocalDate.of(data.getYear(),6,21);
        LocalDate leao = LocalDate.of(data.getYear(),7,23);
        LocalDate virgem = LocalDate.of(data.getYear(),8,23);
        LocalDate libra = LocalDate.of(data.getYear(),9,23);
        LocalDate escorpiao = LocalDate.of(data.getYear(),10,23);
        LocalDate sagitario = LocalDate.of(data.getYear(),11,22);
        LocalDate capricornio = LocalDate.of(data.getYear(),12,22);
        LocalDate aquario = LocalDate.of(data.getYear(),1,21);
        LocalDate peixes = LocalDate.of(data.getYear(),2,19);
        
        if (data.isAfter(aries) && data.isBefore(touro)) {
            return "Seu signo eh áries!";            
        }
        else if (data.isAfter(touro) && data.isBefore(gemeos)) {
            return "Seu signo eh touro!";            
        }
        else if (data.isAfter(gemeos) && data.isBefore(cancer)) {
            return "Seu signo eh gêmeos!";            
        }
        else if (data.isAfter(cancer) && data.isBefore(leao)) {
            return "Seu signo eh câncer!";            
        }
        else if (data.isAfter(leao) && data.isBefore(virgem)) {
            return "Seu signo eh leão!";            
        }
        else if (data.isAfter(virgem) && data.isBefore(libra)) {
            return "Seu signo eh virgem!";            
        }
        else if (data.isAfter(libra) && data.isBefore(escorpiao)) {
            return "Seu signo eh libra!";            
        }
        else if (data.isAfter(escorpiao) && data.isBefore(sagitario)) {
            return "Seu signo eh escorpião!";            
        }
        else if (data.isAfter(sagitario) && data.isBefore(capricornio)) {
            return "Seu signo eh sagitário!";            
        }
        else if (data.isAfter(capricornio) && data.isBefore(aquario)) {
            return "Seu signo eh capricórnio!";            
        }
        else if (data.isAfter(aquario) && data.isBefore(peixes)) {
            return "Seu signo eh aquário!";            
        }else {
            return "Seu signo eh peixes!";
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
