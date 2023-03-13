package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.GameHandler;

/**
 *
 * @author Jakaza G Chauke
 */
public class GameServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    
    HttpSession session = request.getSession(true);
    GameHandler gamehandler = new GameHandler(session);
    Integer toss = gamehandler.compGenerateToss();
    Integer userguess = Integer.parseInt(request.getParameter("userguess"));
    
    // Determine output
    String result = gamehandler.determineResult(toss, userguess, "user");
    
    request.setAttribute("result", result);
    request.setAttribute("toss", toss);
    request.setAttribute("userguess", userguess);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("useroutcome.jsp");
    dispatcher.forward(request, response);
    }
}
