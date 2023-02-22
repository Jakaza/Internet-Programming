package za.ac.tut.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;


public class PersonalisedGreetingServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req , HttpServletResponse res )
	throws ServletException , IOException {
		
		HttpSession session = req.getSession(true);
		
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");
		Integer age = Integer.parseInt(req.getParameter("age"));
		
		
		session.setAttribute("username", username);
		session.setAttribute("email", email);
		session.setAttribute("contact", contact);
		session.setAttribute("age", age);
		
		req.setAttribute("username", username);
		req.setAttribute("email", email);
		req.setAttribute("contact", contact);
		req.setAttribute("age", age);
		
		RequestDispatcher dis = req.getRequestDispatcher("output.jsp");
		
		dis.forward(req, res);
	}
}