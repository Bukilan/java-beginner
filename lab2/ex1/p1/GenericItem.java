package ex1.p1;

public class GenericItem {

    int id;
    String name;
    float price;

    GenericItem analog;

    public void printAll(){
        System.out.printf("itemId: %d, name: %s, price: %.2f\n",
                id,
                name,
                price);
    }
}
