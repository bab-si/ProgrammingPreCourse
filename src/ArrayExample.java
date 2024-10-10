public class ArrayExample {
    public static void main(String[] args) {
        // Deklaration und Initialisierung eines Arrays von int
        String[] myFavouriteColors = new String[3];

        // Zuweisung von Werten zu den Array-Elementen
        myFavouriteColors[0] = "Pink";
        myFavouriteColors[1] = "Green";
        myFavouriteColors[2] = "Blue";

        //Literalinitialisierung ohne new Operator
        String[] myFavouriteColors2 = {"Pink", "Green", "Blue"};

        // Zugriff auf ein Array-Element und Ausgabe
        System.out.println("Erstes Element: " + myFavouriteColors[0]);

        // Länge des Arrays
        System.out.println("Länge des Arrays: " + myFavouriteColors.length);

        // Schleife durch das Array
        for (int i = 0; i < myFavouriteColors.length; i++) {
            System.out.println("Element bei Index " + i + ": " + myFavouriteColors[i]);
        }
    }
}