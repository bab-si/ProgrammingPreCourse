public class Zahlenraten{

    public static void main(String[] args) {
        int glueckszahl = 7;

        switch (glueckszahl) {
            case 1:
            case 2:
            case 3:
            case 10:
                System.out.println("Ganz weit weg!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Fast, knapp daneben");
                break;
            case 7:
                System.out.println("Juhu, wir haben die gleiche Glückszahl");
                break;
            default:
                System.out.println("Daneben!");
                break;
        }
    }
}

