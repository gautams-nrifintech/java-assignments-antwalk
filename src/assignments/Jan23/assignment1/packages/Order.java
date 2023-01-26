package assignments.Jan23.assignment1.packages;

import assignments.Jan23.assignment1.packages.material.Accessories;
import assignments.Jan23.assignment1.packages.material.Laptops;
import assignments.Jan23.assignment1.packages.stock.Inventory;

import java.util.*;


public class Order {
    private final int quantity;
    private final Inventory item;

    public static void main(String[] args) {
        List<Map<Integer,Inventory>> laptops = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Map<Integer,Inventory> map = new HashMap<>();
            var laptop = new Laptops(i);
            laptop.setQuantity((int)(Math.random()*10));
            map.put(i,laptop);
            laptops.add(map);
        }

        System.out.println("LAPTOPS:\n");
        for (int i = 0; i < 5; i++) {
            new Order(2,laptops.get(i).get(i)).placeOrder();
        }

        List<Map<Integer,Inventory>> accessories = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Map<Integer,Inventory> map = new HashMap<>();
            var accessory = new Accessories(i);
            accessory.setQuantity((int)(Math.random()*7));
            map.put(i,accessory);
            accessories.add(map);
        }

        System.out.println();
        System.out.println("ACCESSORIES:\n");

        for (int i = 0; i < 10; i++) {
            new Order(2,accessories.get(i).get(i)).placeOrder();
        }

    }

    public Order(int quantity, Inventory item) {
        this.quantity = quantity;
        this.item = item;
    }

    public void placeOrder() {
        if (this.item.getQuantity() >= this.quantity) {
            this.item.setQuantity(this.item.getQuantity() - this.quantity);
            generateInvoice();
        } else if (this.item.getQuantity() < this.item.getLowOrderLevelQuantity()) {
            generateRFM();
        } else {
            System.out.println("Order quantity exceeds available stock.");
        }
    }

    private void generateInvoice() {
        // code to generate invoice
        System.out.println("______________________________");
        System.out.println("Invoice generated");
        System.out.println(this.item.toString());
        System.out.println("______________________________\n");

    }

    private void generateRFM() {
        // code to generate RFM
        System.out.println("RFM generated");
    }
}

/*
OUTPUT
LAPTOPS:

______________________________
Invoice generated
Laptops{id=0, description='L0', quantity=0, lowOrderLevelQuantity=3}
______________________________

RFM generated
______________________________
Invoice generated
Laptops{id=2, description='L2', quantity=4, lowOrderLevelQuantity=3}
______________________________

______________________________
Invoice generated
Laptops{id=3, description='L3', quantity=4, lowOrderLevelQuantity=3}
______________________________

______________________________
Invoice generated
Laptops{id=4, description='L4', quantity=4, lowOrderLevelQuantity=3}
______________________________


ACCESSORIES:

______________________________
Invoice generated
Accessories{id=0, description='A0', quantity=1, lowOrderLevelQuantity=5}
______________________________

______________________________
Invoice generated
Accessories{id=1, description='A1', quantity=1, lowOrderLevelQuantity=5}
______________________________

RFM generated
______________________________
Invoice generated
Accessories{id=3, description='A3', quantity=2, lowOrderLevelQuantity=5}
______________________________

______________________________
Invoice generated
Accessories{id=4, description='A4', quantity=0, lowOrderLevelQuantity=5}
______________________________

RFM generated
______________________________
Invoice generated
Accessories{id=6, description='A6', quantity=4, lowOrderLevelQuantity=5}
______________________________

RFM generated
RFM generated
RFM generated
 */