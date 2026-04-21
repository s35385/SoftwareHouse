import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {
        System.out.println("---- ZESPOL: " + nazwaProjektu + " ----");
        for (Pracownik p : pracownicy) {
            System.out.println(p.przedstawSie());
            System.out.println("-------------------");
        }
    }

    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.obliczKosztMiesieczny();
        }

        return suma;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik p : pracownicy) {
            if (p.pobierzIdPracownika().equals(idPracownika)) {
                return p;
            }
        }

        return null;
    }

    public void wypiszTesterowAutomatyzujacych() {
        System.out.println("---- TESTERZY AUTOMATYZUJACY ----");

        for (Pracownik p : pracownicy) {
            if (p instanceof Tester) {
                Tester tester = (Tester) p;

                if (tester.isCzyAutomatyzujacy()) {
                    System.out.println(tester.przedstawSie());
                    System.out.println("-------------------");
                }
            }
        }
    }
}