package purchase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouses {

    public static List<Item> storeItemsList = new ArrayList<>();

    public void addItem(Item item) {
        storeItemsList.add(item);
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
