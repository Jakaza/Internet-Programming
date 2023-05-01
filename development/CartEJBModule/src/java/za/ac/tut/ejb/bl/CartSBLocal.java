package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.model.Item;

/**
 * @author Jakaza G Chauke
 */
@Local
public interface CartSBLocal {
    
    public void addItem(Item item);
    
    public void removeItem(Integer id);
    
    public Integer getNumItems();
    
    public List<Item> getItems();
       
}
