package za.ac.tut.model;

/**
 *
 * @author Jakaza G Chauke
 */
public class Item {
    private Integer id;
    private String description;
    private double price;

    public Item(Integer id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + description + ", " + price + "}";
    }   
}
