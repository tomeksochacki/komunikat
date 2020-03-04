public class Komunikat {

private final String komunikat;

private static int liczbaObiektowTejKlasy;

public Komunikat(String komunikat){
    this.komunikat = komunikat;
    liczbaObiektowTejKlasy++;
}

public static int ileObiektowUtworzono(){
    return liczbaObiektowTejKlasy;
}

    public static void main(String[] args) {
        System.out.println("Ile obiektów utworzono" + Komunikat.ileObiektowUtworzono());

        Komunikat k1 = new Komunikat("Witaj");
        Komunikat k2 = new Komunikat("Cześć");
        Komunikat k3 = new Komunikat("Czołem");

        System.out.println("Liczba obiektów klasy komunikat: " + Komunikat.ileObiektowUtworzono());

    }

}
