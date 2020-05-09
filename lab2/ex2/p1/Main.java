package ex2.p1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GenericItem item = new GenericItem();
        item.id = 0;
        item.name = "Bread";
        item.price = 34.56f;

        FoodItem item1 = new FoodItem();
        item1.id = 0;
        item1.name = "Bread";
        item1.price = 34.56f;
        item1.dateOfIncome = new Date();
        item1.expires = 10;

        TechnicalItem item2 = new TechnicalItem();
        item2.id = 0;
        item2.name = "Bread";
        item2.price = 34.56f;
        item2.warrantyTime = 100;

        GenericItem[] items = {
                item,
                item1,
                item2
        };

        for(GenericItem i : items){
            i.printAll();
        }
    }
}
