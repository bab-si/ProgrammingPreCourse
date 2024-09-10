public class ControlStatements {
    public static void main(String[] args)
    {
        // if-Verzweigung: Distanz zweier Variablen
        int a = 10;
        int b = 8;
        int result;
        int difference = a - b;

        if (difference < 0) {
            result = -difference;
        } else {
            result = difference;
        }

        System.out.println("Der Betrag der Differenz zwischen " + a + " und " + b + " ist: " + result);

        // switch-Verzweigung: Wochentage
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültig");
                break;
        }

        // for-Schleife: Parkhaus
        int totalParkingSpaces = 10;
        int carsEntering = 7;

        System.out.println("Gesamtparkplätze " + totalParkingSpaces);
        System.out.println("Insgesamt " + carsEntering + " einfahrende Autos.");

        for (int i = 1; i <= carsEntering; i++) {
            System.out.println("Auto " + i + " ist in das Parkhaus eingefahren.");
        }

        // while-Schleife:
        int count = 10;
        System.out.println("Der Countdown ins neue Jahr beginnt:");

        while (count >= 0) {
            System.out.println("Sekunden bis Mitternacht: " + count);
            count--;
        }

        System.out.println("Happy New Year!");

        // do-while-Schleife: Silvestercountdown
        System.out.println("Der Countdown ins neue Jahr beginnt:");

        count = 10;
        do {
            System.out.println("Sekunden bis Mitternacht: " + count);
            count--;
        } while (count > 0);

        System.out.println("Happy New Year!");

    }
}
