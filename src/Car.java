// this class contains a constructor, getter and setter
class Car {
    int ps;
    int yearOfConstruction;

    int price;

    String brand;
    String name;

    //Standardkonstruktor
    public Car() {
        this.ps = 80;
        this.yearOfConstruction = 2006;
        this.price = 45000;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        if (price < 135000000) {
            this.price = price;
        } else {
            System.out.println("Preis ist ungültig.");
        }
    }

    protected void drive() {
        System.out.println("brum brumm");
    }

    protected void showDetails() {
        System.out.println("PS: " + ps + ", Baujahr: " + yearOfConstruction + ", Preis: " + price);
    }
}

class mainCar {
    public static void main(String[] args) {
        // Erstellen eines Objektes der Klasse Car
        Car myCar = new Car();
        myCar.ps = 120;
        myCar.yearOfConstruction = 2021;
        myCar.brand = "Mercedes";
        myCar.name = "Stella";

        myCar.drive();
        myCar.showDetails();

        // the use of the string method "equals" is shown in the method below
        if (myCar.brand.equals(myCar.name)) {
            System.out.println("Unkreativ");
        } else {
            System.out.println("Gut gemacht");
        }
    }
}
