package ex1.p1;

public class Main {
    public static void main(String[] args) {
        GenericItem item = new GenericItem();
        item.id = 0;
        item.name = "Bread";
        item.price = 34.56f;

        GenericItem item1 = new GenericItem();
        item1.id = 0;
        item1.name = "Bread";
        item1.price = 34.56f;

        GenericItem item2 = new GenericItem();
        item2.id = 0;
        item2.name = "Bread";
        item2.price = 34.56f;

        item.printAll();
        item1.printAll();
        item2.printAll();
    }
}
