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
public class EndGameSevlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    
    HttpSession session = request.getSession();
    GameHandler gamehandler = new GameHandler(session);
    String dWinner = gamehandler.determineWinner("computer", "user");
    
    Integer cScore = (Integer)session.getAttribute("computerCorrect");
    Integer uScore = (Integer)session.getAttribute("userCorrect");
    
    session.invalidate();
    
    request.setAttribute("winner", dWinner);
    request.setAttribute("cScore", cScore);
    request.setAttribute("uScore", uScore);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("ovalloutcome.jsp");
    dispatcher.forward(request, response);
    }
}
