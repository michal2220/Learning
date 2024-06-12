public class Piosenka {
    private final String tytul;
    private final String artysta;
    private final String gatunek;
    private final int rok;
    private final int liczbaOdtworzen;

    public Piosenka(String tytul, String artysta, String gatunek, int rok, int liczbaOdtworzen) {
        this.tytul = tytul;
        this.artysta = artysta;
        this.gatunek = gatunek;
        this.rok = rok;
        this.liczbaOdtworzen = liczbaOdtworzen;
    }

    @Override
    public String toString() {
        return          "tytul='" + tytul + '\'' +
                        ", artysta='" + artysta + '\'' +
                        ", gatunek='" + gatunek + '\'' +
                        ", rok=" + rok +
                        ", liczbaOdtworzen=" + liczbaOdtworzen;
    }

    public String getTytul() {
        return tytul;
    }

    public String getArtysta() {
        return artysta;
    }

    public String getGatunek() {
        return gatunek;
    }

    public int getRok() {
        return rok;
    }

    public int getLiczbaOdtworzen() {
        return liczbaOdtworzen;
    }
}