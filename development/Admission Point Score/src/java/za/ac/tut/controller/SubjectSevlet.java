/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.SubjectManager;

/**
 *
 * @author Jakaza G Chauke
 */
public class SubjectSevlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        String major = request.getParameter("major");
        Integer math = Integer.parseInt(request.getParameter("math"));
        Integer sub1 = Integer.parseInt(request.getParameter("subject2-mark"));
        Integer sub2 = Integer.parseInt(request.getParameter("subject3-mark"));
        Integer sub3 = Integer.parseInt(request.getParameter("subject4-mark"));
        Integer sub4 = Integer.parseInt(request.getParameter("subject5-mark"));
        Integer sub5 = Integer.parseInt(request.getParameter("subject6-mark"));

        Integer[] marks = {math, sub1,sub2, sub3, sub4 , sub5}; 
        SubjectManager subjectManager = new SubjectManager();
        Integer aps = subjectManager.calculateAPS(marks);
        String outcome = subjectManager.getOutcome(aps , major);
        
        request.setAttribute("aps", aps);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("output.jsp");
        requestDispatcher.forward(request, response);
    }
}
