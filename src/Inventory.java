import java.util.ArrayList;

public class Inventory {

    ArrayList<String> inventory;

    public Inventory(){
        inventory = new ArrayList<>();
    }

    public void addItem(String newItem){
        inventory.add(newItem);
    }

    public void removeItem(String usedItem){
        inventory.remove(usedItem);
    }

    public void showInventory(){
        for(String item : inventory){
            System.out.println(item);
        }
    }

    public boolean hasItem(String item){
        return inventory.contains(item);
    }

}
