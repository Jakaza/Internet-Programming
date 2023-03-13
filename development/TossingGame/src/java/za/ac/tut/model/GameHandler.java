package za.ac.tut.model;

import java.util.Random;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jakaza G Chauke
 */
public class GameHandler {
    HttpSession session;

    public GameHandler(HttpSession session) {
        this.session = session;
    }
    public void initGame(){
        Integer computerCorrect = 0, computerTotal = 0;
        Integer userCorrect = 0, userTotal = 0;
        
        session.setAttribute("computerCorrect", computerCorrect);
        session.setAttribute("computerTotal", computerTotal );
        session.setAttribute("userCorrect", userCorrect );
        session.setAttribute("userTotal", userTotal);
    }
    public Integer compGenerateToss(){
        Random rand = new Random();
        Integer number = rand.nextInt(2);
        return number;
    }
    public String determineResult(Integer guess, Integer generatedToss , String userOrComp){
        
        if(guess != 0 || guess != 1){
            throw new NumberRangeException("Invalid Number (The Value be 1 or 0)");
        }
     
        String output = "WRONG";
        Integer correct = (Integer)session.getAttribute(userOrComp+"Correct");
        Integer total = (Integer)session.getAttribute(userOrComp+"Total");
        if(guess.equals(generatedToss)){
            output = "CORRECT";
            correct++;
        }
        total++;
        session.setAttribute(userOrComp+"Correct", correct );
        session.setAttribute(userOrComp+"Total", total );
        return output;
    }
    
    public String determineWinner(String compter, String user){
        Integer computerCorrect = (Integer)session.getAttribute(compter+"Correct");
        Integer userCorrect = (Integer)session.getAttribute(user+"Correct");
        String winner = "Draw, No Winner";
        if(computerCorrect > userCorrect){
            winner = "Compter Won";
        }else if(userCorrect > computerCorrect){
            winner = "User Won";
        }
        return winner;
    }

    public Integer computerGuessToss() {
        Random rand = new Random();
        Integer number = rand.nextInt(2);
        return number;
    }
  
}
