package ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import za.ac.tut.model.Item;

/**
 *
 * @author Jakaza G Chauke
 */
@Stateful
public class CartSB implements CartSBLocal {
    
    private List<Item> cart = new ArrayList<>();
    
    @Override
    public void addItem(Item item) {
        cart.add(item);
    }

    @Override
    public void removeItem(Integer id) {
        for(int i = 0; i < cart.size(); i++){
            if(cart.get(i).getId().equals(id)){
                cart.remove(i);
            }
        }
    }

    @Override
    public Integer getNumItems() {
        return cart.size();
    }

    @Override
    public List<Item> getItems() {
        return cart;
    }
  
}
