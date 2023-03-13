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
public class CompGameServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    
    HttpSession session = request.getSession();
    GameHandler gamehandler = new GameHandler(session);
    Integer toss = Integer.parseInt(request.getParameter("toss"));
    Integer compGuess = gamehandler.computerGuessToss();
    
    // Determine output
    String result = gamehandler.determineResult(toss,compGuess,"computer");
    
    request.setAttribute("result", result);
    request.setAttribute("toss", toss);
    request.setAttribute("compguess", compGuess);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("computeroutcome.jsp");
    dispatcher.forward(request, response);
    }
}
