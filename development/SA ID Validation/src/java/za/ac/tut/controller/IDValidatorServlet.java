package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.IDValidator;

/**
 *
 * @author Jakaza G Chauke
 */
@WebServlet(name = "IDValidatorServlet", urlPatterns = {"/IDValidatorServlet.do"})
public class IDValidatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idNumber = request.getParameter("id_number");
        
        IDValidator idValidator = new IDValidator();
        
        boolean status = idValidator.isValidIDNumber(idNumber);
        if(status){
            
            LocalDate birthdate = idValidator.getBirthDate(idNumber);
            String gender = idValidator.getGender(idNumber);
            String citizenship = idValidator.getCitizenship();
            Integer age = idValidator.getAge(birthdate);
 
        }else{
            // is not valid.
        }
    }
}
