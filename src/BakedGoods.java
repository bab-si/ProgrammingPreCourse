// this class shows inheritance: BakedGoods is the superclass of Cake
public class BakedGoods {
    public double flour;
    public double sugar;
    public int eggs;

    public void showMainIngredients(){
        System.out.println("Mehl: " + flour +
                " Zucker: " + sugar + " Eier: " + eggs);
    }
}

class MainBakedGoods {
    public static void main(String[] args) {
        BakedGoods bakedGoods = new BakedGoods();
        bakedGoods.flour = 180;
        bakedGoods.sugar = 220;
        bakedGoods.eggs = 3;
        bakedGoods.showMainIngredients();
    }
}

