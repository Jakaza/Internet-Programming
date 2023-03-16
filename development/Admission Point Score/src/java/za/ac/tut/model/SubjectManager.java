package za.ac.tut.model;

/**
 *
 * @author Jakaza G Chauke
 */
public class SubjectManager {

    public SubjectManager() {
    }

    public Integer calculateAPS(Integer[] marks) {
        Integer aps = 0;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > 7){
                if(marks[i] > 7 && marks[i] <= 29)
                    aps += 1;
                else if(marks[i] >= 30 && marks[i] <= 39)
                    aps += 2;
                else if(marks[i] >= 40 && marks[i] <= 49)
                    aps += 3;
                else if(marks[i] >= 50 && marks[i] <= 59)
                    aps += 4;
                else if(marks[i] >= 60 && marks[i] <= 69)
                    aps += 5;
                else if(marks[i] >= 70 && marks[i] <= 79)
                    aps += 6;
                else if(marks[i] >= 80 && marks[i] <= 100)
                    aps += 7;
                else{
                    // Invalid Input
                }
            }
            if(marks[i] >= 0 && marks[i] <= 7){
             aps += marks[i];   
            }else{
                // Invalid Input
            }  
        }
        return aps;
    }

    public String getOutcome(Integer aps , String major, boolean comStatus) {
        String outcome = "Do not meet requirements";
        
        if(comStatus == false){
           return outcome + " : failed major subject."; 
        }
        if(((major.equals("mathematics") || (major.equals("tech"))) && aps >= 26)
                || (major.equals("lit") && aps >= 28))
        {
           outcome = "Meet requirements for mainstream."; 
        }
        else if(((major.equals("mathematics") || (major.equals("tech"))) && aps >= 23)
                    ||(major.equals("lit") && aps >= 25))
        {
           outcome = "Meet requirements for extended program."; 
        }        
        return outcome;
    }
    
    public boolean checkMajors(Integer[] composary){
        for(Integer mark : composary){
            if(mark > 7){
                if(mark < 30){
                    return false;
                }
            }else if(mark <= 2 ){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }
    
}
