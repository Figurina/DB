package ClubFactoryMethodSingleton;

import java.util.ArrayList;
import java.util.List;

public abstract class Jucator {
    protected List<String> antrenamente;
    protected String nume;

    public Jucator(String nume) {
        this.nume = nume;
        this.antrenamente = new ArrayList<>();
    }

    public abstract void adaugaAntrenamenteDefault();

    public void actualizeazaAntrenament(String antrenament) {
        antrenamente.add(antrenament);
    }

    public void afiseazaAntrenamente() {
        System.out.println(nume + " - Antrenamente: " + antrenamente);
    }
}