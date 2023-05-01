package za.ac.tut.controller;

import ac.tut.ejb.bl.CartSB;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.Item;

/**
 *
 * @author Jakaza G Chauke
 */
public class ProcessingServlet extends HttpServlet {
    @EJB
    private CartSB crt;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "outcome.jsp";
        String outcome = "";
        
        String option = request.getParameter("op");
        
        if(option.equals("add")){
            
            Integer id = Integer.parseInt(request.getParameter("id"));
            String des = request.getParameter("description");
            double price = Double.parseDouble(request.getParameter("price"));
            Item item = new Item(id, des, price);
            crt.addItem(item);
            outcome = "New Item Added.";
            request.setAttribute("outcome", outcome);
            
        }else if(option.equals("remove")){
            
            Integer id = Integer.parseInt(request.getParameter("id"));
            crt.removeItem(id);
            outcome = "The item has been successfully removed.";
            request.setAttribute("outcome", outcome);
            
        }else{
            
            Integer numItems = crt.getNumItems();
            List<Item> items = crt.getItems();
            
            request.setAttribute("numItems", numItems);
            request.setAttribute("items", items);
            url = "items.jsp";
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(url);
        requestDispatcher.forward(request, response);
    }
}
