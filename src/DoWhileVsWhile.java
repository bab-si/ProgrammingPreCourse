public class DoWhileVsWhile {
    public static void main(String[] args) {
        // Mit while-Schleife
        int number = 0;
        System.out.println("while-Schleife:");
        while (number < 5 || number > 10) {
            System.out.println("Zahl " + number + " liegt nicht zwischen 5 und 10. Zahl wird erhöht.");
            number++;
        }
        System.out.println("Zahl " + number + " liegt jetzt zwischen 5 und 10.\n");

        // Mit do-while-Schleife
        number = 0;  // Zurücksetzen der Zahl
        System.out.println("do-while-Schleife:");
        do {
            System.out.println("Zahl " + number + " wird erhöht.");
            number++;
        } while (number < 5 || number > 10);
        System.out.println("Zahl " + number + " liegt jetzt zwischen 5 und 10.");
    }
}
