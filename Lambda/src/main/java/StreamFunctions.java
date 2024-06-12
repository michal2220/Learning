import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFunctions {


    public void getRock(List<Piosenka> piosenki) {
        List<Piosenka> piosenkiRockowe = piosenki.stream()
                .filter(p -> p.getGatunek().contains("Rock"))
                .collect(Collectors.toList());

        System.out.println(piosenkiRockowe);
    }

    public  void getGenre(List<Piosenka> piosenkas) {
        Set<String> gatunki = piosenkas.stream()
                .map(m->m.getGatunek())
                .collect(Collectors.toSet());

        System.out.println(gatunki);
    }
}
