package lab5_game_inventory_mgmt_Iterators;

public class Item {
    String name;

    // Constructor, getter, toString...
    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
