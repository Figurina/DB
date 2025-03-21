package ClubFactoryMethodSingleton;

public class Atacant extends Jucator {
    public Atacant(String nume) {
        super(nume);
        adaugaAntrenamenteDefault();
    }

    @Override
    public void adaugaAntrenamenteDefault() {
        antrenamente.add("Antrenament specific atacant");
        antrenamente.add("Antrenament general de fitness");
    }
}