// this class shows inheritance: Cake is the subclass of BakedGoods, which can be seen by the "extends" keyword
public class Cake extends BakedGoods{
    public boolean filling;
    public String typeOfDough;
}

class MainCake {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.flour = 150;
        cake.sugar = 120;
        cake.eggs = 2;
        cake.filling = true;
        cake.typeOfDough = "Rührteig";

        cake.showMainIngredients();
    }
}

