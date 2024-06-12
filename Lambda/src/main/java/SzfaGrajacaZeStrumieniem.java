import java.util.List;
import java.util.stream.Collectors;

public class SzfaGrajacaZeStrumieniem {
    public static void main(String[] args) {
        List<Piosenka> piosenki = new DaneSzafyGrajacej.Piosenki().pobierzPiosenki();

        List<Piosenka> piosenkiRockowe = piosenki.stream()
                .filter(p -> p.getGatunek().equals("Rock"))
                .collect(Collectors.toList());

        System.out.println(piosenkiRockowe);
    }
}
