public class Czlowiek {
    private String imie;
    private int wiek;
    private Oczy oczy;
    private Wlosy wlosy;

    public Czlowiek(String imie, int wiek, Oczy oczy, Wlosy wlosy) {
        this.imie = imie;
        this.wiek = wiek;
        this.oczy = oczy;
        this.wlosy = wlosy;
    }

    @Override
    public String toString() {
        return String.format("Oto %s ma %s lat i ma %s czy i ma %s włosy", imie, wiek, oczy, wlosy);
    }
}
