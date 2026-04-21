public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa();

        if (czyAutomatyzujacy) {
            koszt += 800;
        }

        if (liczbaScenariuszy > 20) {
            koszt += 300;
        }

        return koszt;
    }

    @Override
    public String przedstawSie() {
        return "Tester: " + getImie() + " " + getNazwisko() +
                "\nAutomatyzujacy: " + czyAutomatyzujacy +
                "\nScenariusze: " + liczbaScenariuszy;
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchomiono raport testow dla pracownika " + pobierzIdPracownika());
    }
}