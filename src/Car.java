// this class contains a constructor, getter and setter
class Car {
    int ps;
    int yearOfConstruction;

    public float dirty;

    private int price;
    private int colourcode;

    String brand;
    String name;

    //Standardkonstruktor
    public Car() {
        this.ps = 80;
        this.yearOfConstruction = 2006;
        this.price = 45000;
    }

    // Getter for colourcode
    public int getColourcode() {
        return price;
    }

    // Setter for colourcode
    public void setColourcode(int code) {
        if (code != 000000) {
            this.colourcode = code;
        } else {
            System.out.println("Schwarze Autos werden nicht produziert.");
        }
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

    public void wash(float time) {
        dirty -= time;
    }

    protected void drive() {
        dirty += 0.75F;
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

        Car happyCar = new Car();
        happyCar.setColourcode(123456);
        System.out.println(happyCar.getColourcode());

        System.out.println(myCar.dirty);
        myCar.drive();
        myCar.wash(0.23F);
        System.out.println(myCar.dirty);

        myCar.showDetails();

        // the use of the string method "equals" is shown in the method below
        if (myCar.brand.equals(myCar.name)) {
            System.out.println("Unkreativ");
        } else {
            System.out.println("Gut gemacht");
        }
    }
}
