package ClubFactoryMethodSingleton;

public class Portar extends Jucator {
    public Portar(String nume) {
        super(nume);
        adaugaAntrenamenteDefault();
    }

    @Override
    public void adaugaAntrenamenteDefault() {
        antrenamente.add("Antrenament specific portar");
        antrenamente.add("Antrenament general de fitness");
    }
}