public class Firma {
    private Mitarbeiter[] mitarbeiterListe;
    private int aktuelleAnzahlMitarbeiter;

    public Firma() {
        mitarbeiterListe = new Mitarbeiter[10];  // Maximale Anzahl von 10 Mitarbeitern
        aktuelleAnzahlMitarbeiter = 0;
    }

    // Methode zum Hinzufügen eines Mitarbeiters
    public void fuegeMitarbeiterHinzu(Mitarbeiter mitarbeiter) {
        if (aktuelleAnzahlMitarbeiter < mitarbeiterListe.length) {
            mitarbeiterListe[aktuelleAnzahlMitarbeiter] = mitarbeiter;
            aktuelleAnzahlMitarbeiter++;
        } else {
            System.out.println("Keine weiteren Mitarbeiter können hinzugefügt werden.");
        }
    }

    // Methode zur Ausgabe aller Mitarbeiterinformationen
    public void zeigeAlleMitarbeiter() {
        for (int i = 0; i < aktuelleAnzahlMitarbeiter; i++) {
            mitarbeiterListe[i].zeigeInformationen();
            System.out.println("---------------");
        }
    }
}

class FirmaMain {
    public static void main(String[] args) {
        // Mitarbeiter erstellen
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Anna", "Frontend Developer", 50000);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Max", "Backend Developer", 60000);

        // Firma erstellen und Mitarbeiter hinzufügen
        Firma firma = new Firma();
        firma.fuegeMitarbeiterHinzu(mitarbeiter1);
        firma.fuegeMitarbeiterHinzu(mitarbeiter2);

        // Informationen aller Mitarbeiter anzeigen
        firma.zeigeAlleMitarbeiter();

        // Gehalt von Anna um 10% erhöhen und erneut anzeigen
        mitarbeiter1.erhoeheGehalt(10);
        mitarbeiter1.zeigeInformationen();
    }
}
