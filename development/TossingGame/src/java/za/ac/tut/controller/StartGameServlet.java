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
public class StartGameServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
    
    HttpSession session = request.getSession(true);
    GameHandler gamehandler = new GameHandler(session);
    gamehandler.initGame();
    
//    Integer toss = gamehandler.compGenerateToss();
//    
//    request.setAttribute("toss", toss);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("userquess.jsp");
    dispatcher.forward(request, response);
    }
}
