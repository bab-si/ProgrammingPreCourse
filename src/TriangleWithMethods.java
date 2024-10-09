public class TriangleWithMethods {

    public static void main(String[] args) {
        // Feste Werte für die Seitenlängen des Dreiecks
        double a = 3;
        double b = 4;
        double c = 7;

        // Überprüfen, ob es ein gültiges Dreieck ist
        if (isValidTriangle(a, b, c)) {
            if (isGleichseitig(a, b, c)) {
                System.out.println("Das Dreieck ist gleichseitig.");
            } else if (isRechtwinklig(a, b, c) && isGleichschenklig(a, b, c)) {
                System.out.println("Das Dreieck ist rechtwinkelig und gleichschenkelig.");
            } else if (isRechtwinklig(a, b, c)) {
                System.out.println("Das Dreieck ist rechtwinkelig.");
            } else if (isGleichschenklig(a, b, c)) {
                System.out.println("Das Dreieck ist gleichschenkelig.");
            } else {
                System.out.println("Das Dreieck ist ein sonstiges gültiges Dreieck.");
            }
        } else {
            System.out.println("Das Dreieck ist ungültig.");
        }
    }

    // Methode zur Prüfung, ob es ein gültiges Dreieck ist
    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Methode zur Prüfung, ob das Dreieck gleichseitig ist
    public static boolean isGleichseitig(double a, double b, double c) {
        return a == b && b == c;
    }

    // Methode zur Prüfung, ob das Dreieck gleichschenkelig ist
    public static boolean isGleichschenklig(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    // Methode zur Prüfung, ob das Dreieck rechtwinkelig ist (Pythagoras)
    public static boolean isRechtwinklig(double a, double b, double c) {
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        return (Math.abs(a2 + b2 - c2) < 0.0001) ||
                (Math.abs(a2 + c2 - b2) < 0.0001) ||
                (Math.abs(b2 + c2 - a2) < 0.0001);
    }
}
