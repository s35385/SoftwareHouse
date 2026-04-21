public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;


    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa();

        if (liczbaRepozytoriow > 3) {
            koszt += 500;
        }

        return koszt;
    }

    @Override
    public String przedstawSie() {
        return "Programista: " + getImie() + " " + getNazwisko() +
                "\nJezyk: " + glownyJezyk +
                "\nRepozytoria: " + liczbaRepozytoriow;
    }

    public void wypiszTechnologie() {
        System.out.println("Programista pracuje w technologii: " + glownyJezyk);
    }

    @Override
    public String toString() {
        return "Programista{" +
                "id=" + pobierzIdPracownika() +
                ", imie=" + getImie() +
                ", nazwisko=" + getNazwisko() +
                ", stawka=" + getStawkaBazowa() +
                ", jezyk=" + glownyJezyk +
                ", repozytoria=" + liczbaRepozytoriow +
                '}';
    }
}