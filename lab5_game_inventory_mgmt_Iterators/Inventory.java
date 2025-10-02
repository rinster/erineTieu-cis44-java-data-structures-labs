package lab5_game_inventory_mgmt_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void display() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void combineItems(String name1, String name2, String combinedName) {
        Item item1 = null;
        Item item2 = null;

        for (Item item : items) {
            if (item1 == null & item.getName().equals(name1)) {
                item1 = item;
            } else if (item2 == null && item.getName().equals(name2)) {
                item2 = item;
            }
        }

        if (item1 != null && item2 != null) {
            Iterator<Item> iter = items.iterator();
            while (iter.hasNext()) {
                Item current = iter.next();
                if (current == item1 || current == item2) {
                    iter.remove();
                }
            }

            items.add(new Item(combinedName));
            System.out.println("Combined '" + name1 + "' and '" + name2 + "' into '" + combinedName + "'");
        } else {
            System.out.println("Cannot combine. You need both '" + name1 + "' and '" + name2 + "' in inventory.");
        }
    }
}