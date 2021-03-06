/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import HibFiles.Comment;
import HibFiles.Notification;
import HibFiles.PoolManager;
import HibFiles.Recipe;
import HibFiles.UserLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author User
 */
public class PostComment extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        try {

            //Get attributes from http request
            String rid = request.getParameter("rid");
            String comment = request.getParameter("comment");

            System.out.println(rid);
            System.out.println(comment);

            String msg = "";

            //Create hibernate session
            Session s = PoolManager.getSessionFactory().openSession();

            //Initiate transaction
            Transaction t = s.beginTransaction();

            //Load recipe with given rid
            Recipe r = (Recipe) s.load(Recipe.class, Integer.parseInt(rid));

            //Get currently logged in user
            UserLogin ul = (UserLogin) request.getSession().getAttribute("user");

            Comment com = new Comment();
            com.setRecipe(r);
            com.setCommentDesc(comment);
            com.setDate(new Date());
            com.setTime(new Date());
            com.setUser(ul.getUser());

            s.save(com);

            String logged_in = ul.getUser().getIduser() + "";
            String us = r.getUser().getIduser() + "";

            if (!logged_in.equals(us)) {

                Notification n = new Notification();
                n.setCategory("Comment on Recipe");
                n.setDate(new Date());
                n.setUser(r.getUser());
                n.setStatus("Unread");
                n.setNotification(ul.getUser().getFname() + " commented on your recipe " + r.getName() + " : " + comment);

                s.save(n);
            }
            t.commit();

            msg = "success";

            out.write(msg);

        } catch (Exception e) {
            throw new ServletException();
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
