import java.util.List;

public class SzfaGrajacaZeStrumieniem {
    public static void main(String[] args) {
        List<Piosenka> piosenki = new DaneSzafyGrajacej.Piosenki().pobierzPiosenki();
        StreamFunctions streamFunctions = new StreamFunctions();

        streamFunctions.getRock(piosenki);
        streamFunctions.getGenre(piosenki);
    }

}
