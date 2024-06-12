import java.util.List;

public class DaneSzafyGrajacej {
    public static class Piosenki {
        public List<Piosenka> pobierzPiosenki() {
            return List.of(
                    new Piosenka("$10", "Hitchhiker", "Elektroniczna", 2016, 183),
                    new Piosenka("Havana", "Camila Cabello", "R&B", 2017, 324),
                    new Piosenka("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                    new Piosenka("50 ways", "Paul Simon", "Łagodny rock", 1975, 199),
                    new Piosenka("Hurt", "Nine Inch Nails", "Industrial rock", 1995, 257),
                    new Piosenka("Silence", "Delerium", "Elektroniczna", 1999, 134),
                    new Piosenka("Hurt", "Johnny Cash", "Łagodny rock", 2002, 392),
                    new Piosenka("Watercolour", "Pendulum", "Elektroniczna", 2010, 155),
                    new Piosenka("Mniej niż zero", "Lady Pank", "Rock", 1983, 259),
                    new Piosenka("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                    new Piosenka("Come Together", "The Beatles", "Blues rock", 1968, 173),
                    new Piosenka("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                    new Piosenka("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                    new Piosenka("Immigrant Song", "Karen O", "Industrial rock", 2011, 12),
                    new Piosenka("Breathe", "The Prodigy", "Elektroniczna", 1996, 337),
                    new Piosenka("What’s Going On", "Gaye", "R&B", 1971, 420),
                    new Piosenka("Autobiografia", "Perfect", "Rock", 1982, 480),
                    new Piosenka("All My Love", "Led Zeppelin", "Rock", 1979, 402 ),
                    new Piosenka("I am not a woman, I’m a god", "Halsey", "Rock alternatywny", 2021, 384),
                    new Piosenka("Pasos de cero", "Pablo Alborán", "Latynoska", 2014, 117),
                    new Piosenka("Smooth", "Santana", "Latynoska", 1999, 244),
                    new Piosenka("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));
        }
    }
}
