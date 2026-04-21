import java.util.Objects;

public class Pracownik {

    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;
    }

    public String przedstawSie() {
        return "Pracownik: " + imie + " " + nazwisko +
                "\nID: " + idPracownika;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "idPracownika='" + idPracownika + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaBazowa=" + stawkaBazowa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik that = (Pracownik) o;
        return this.idPracownika.equals(that.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPracownika);
    }
}