import java.util.*;
class Box<T> {
    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.addItem("scadric");
        nameBox.addItem("luna");
        nameBox.addItem("");
        System.out.println("Names in Box:");
        nameBox.displayItems();
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);
        System.out.println("\nRoll Numbers in Box:");
        rollBox.displayItems();
    }
}
