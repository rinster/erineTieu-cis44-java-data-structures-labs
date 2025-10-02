package lab5_game_inventory_mgmt_Iterators;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("stick"));
        inventory.addItem(new Item("flint"));
        inventory.addItem(new Item("rope"));

        inventory.display();

        // Combine stick + flint → torch
        inventory.combineItems("stick", "flint", "torch");

        inventory.display();

        // Try combining rope + stick again (stick was already used)
        inventory.combineItems("rope", "stick", "bow");

        inventory.display();
    }

}
