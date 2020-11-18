package purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouses {

    public static List<Item> storeItemsList = new ArrayList<>();

    public List<Item> getStoreItemsList() {
        return storeItemsList;
    }

    public void setStoreItemsList(List<Item> storeItemsList) {
        Warehouses.storeItemsList = storeItemsList;
    }

    public void addItem(Item item) {
        Warehouses.storeItemsList.add(item);
    }

    public void removeItem(Item item) {
        Warehouses.storeItemsList.remove(item);
    }

    public Item getItemInfo(String name) {
        Optional<Item> userObject = storeItemsList.stream().
                filter(item -> item.getName().equals(name)).
                findFirst();
        //null
        Item item = userObject.get();
        return item;
    }

}
