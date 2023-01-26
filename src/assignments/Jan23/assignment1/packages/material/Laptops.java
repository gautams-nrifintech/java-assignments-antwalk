package assignments.Jan23.assignment1.packages.material;

import assignments.Jan23.assignment1.packages.stock.Inventory;


public class Laptops extends Inventory {
    private int id;
    private String description;

    public Laptops(int id) {
        this.id = id;
        this.description = "L"+id;
        super.setLowOrderLevelQuantity(3);
    }

    @Override
    public String toString() {
        return "Laptops{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", lowOrderLevelQuantity=" + lowOrderLevelQuantity +
                '}';
    }
}