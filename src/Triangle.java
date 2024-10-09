public class Triangle {

    public static void main(String[] args){

        // Werte für die Seitenlängen des Dreiecks
        double a = 3;
        double b = 4;
        double c = 5;

        // Überprüfen, ob es ein gültiges Dreieck ist
        if (a + b > c && a + c > b && b + c > a) {
            // Gleichseitiges Dreieck
            if ( a == b && b == c) {
                System.out.println("Das Dreieck ist gleichseitig.");

            // Rechtwinkliges Dreieck (Pythagoras)
            } else if ((a * a + b * b == c * c) ||
                    (a * a + c * c == b * b) ||
                    (b * b + c * c == a * a)) {
                System.out.println("Das Dreieck ist rechtwinkelig.");

            // Gleichschenkliges Dreieck
            } else if (a == b || b == c || a == c) {
                System.out.println("Das Dreieck ist gleichschenkelig.");

            // Sonstiges gültiges Dreieck
            } else {
                System.out.println("Das Dreieck ist ein sonstiges gültiges Dreieck.");
            }
        } else {
            System.out.println("Das Dreieck ist ungültig.");
        }
    }
 }


