public class Mitarbeiter {
    private String name;
    private String position;
    private double gehalt;

    // Konstruktor
    public Mitarbeiter(String name, String position, double gehalt) {
        this.name = name;
        this.position = position;
        this.gehalt = gehalt;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    // Methode zum Erhöhen des Gehalts
    public void erhoeheGehalt(double prozent) {
        gehalt = gehalt * (1 + prozent / 100);
    }

    // Methode zur Ausgabe der Informationen
    public void zeigeInformationen() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Gehalt: " + gehalt + " EUR");
    }
}
