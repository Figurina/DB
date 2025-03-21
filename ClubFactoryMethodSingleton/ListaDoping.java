package ClubFactoryMethodSingleton;

import java.util.HashSet;
import java.util.Set;

public class ListaDoping {
    private static ListaDoping instanta;
    private Set<String> substanteInterzise;

    private ListaDoping() {
        substanteInterzise = new HashSet<>();
    }

    public static ListaDoping getInstanta() {
        if (instanta == null) {
            instanta = new ListaDoping();
        }
        return instanta;
    }

    public void adaugaSubstantaInterzisa(String substanta) {
        substanteInterzise.add(substanta);
    }

    public boolean esteSubstantaInterzisa(String substanta) {
        return substanteInterzise.contains(substanta);
    }

    public void afiseazaSubstanteInterzise() {
        System.out.println("Substante interzise: " + substanteInterzise);
    }
}
